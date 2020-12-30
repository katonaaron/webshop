package com.fullcart.user

import com.fullcart.session.Webshop.UserSession.UserSession._
import com.fullcart.session.Webshop.UserSession.{UserSession, roles}
import com.fullcart.session.Webshop.UserSession.statechans.U.UserSession_U_1
import com.fullcart.user.controller.UserController
import org.scribble.main.ScribRuntimeException
import org.scribble.runtime.message.ObjectStreamFormatter
import org.scribble.runtime.net.SocketChannelServer
import org.scribble.runtime.session.MPSTEndpoint
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.core.env.Environment

import java.io.IOException

@SpringBootApplication
class ApplicationConfig

object UserServiceApplication {

  val PortProperty = "fullcart.user-service.port"

  def main(args: Array[String]): Unit = {
    val context = SpringApplication.run(classOf[ApplicationConfig])

    val productController = context.getBean(classOf[UserController])
    val env = context.getBean(classOf[Environment])

    val port = env.getProperty(PortProperty).toInt

    startServer(productController, port)
  }

  private def startServer(userController: UserController, port: Int): Unit = {
    val ss = new SocketChannelServer(port)

    try {
      while (true) {
        val session = new UserSession()

        try {
          val server = new MPSTEndpoint[UserSession, roles.U](session, U, new ObjectStreamFormatter())

          server.accept(ss, C)

          userController.start(server, new UserSession_U_1(server))
        } catch {
          case e@(_: ScribRuntimeException | _: IOException) => e.printStackTrace()
        }
      }

    } finally {
      ss.close()
    }
  }
}
