package com.fullcart.user.server

import com.fullcart.session.Webshop.UserSession.UserSession.{C, U}
import com.fullcart.session.Webshop.UserSession.statechans.U.UserSession_U_1
import com.fullcart.session.Webshop.UserSession.{UserSession, roles}
import com.fullcart.user.controller.UserSessionController
import org.scribble.main.ScribRuntimeException
import org.scribble.runtime.message.ObjectStreamFormatter
import org.scribble.runtime.net.SocketChannelServer
import org.scribble.runtime.session.MPSTEndpoint
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

import java.io.IOException

@Component
class UserSessionServer(private val controller: UserSessionController) extends Thread {
  @Value("${fullcart.user-session.user-service.port}")
  private val Port: Int = 0

  override def run(): Unit = {
    val ss = new SocketChannelServer(Port)

    try {
      while (true) {
        val session = new UserSession()

        try {
          val server = new MPSTEndpoint[UserSession, roles.U](session, U, new ObjectStreamFormatter())

          server.accept(ss, C)

          controller.start(server, new UserSession_U_1(server))
        } catch {
          case e@(_: ScribRuntimeException | _: IOException) => e.printStackTrace()
        }
      }

    } finally {
      ss.close()
    }
  }
}
