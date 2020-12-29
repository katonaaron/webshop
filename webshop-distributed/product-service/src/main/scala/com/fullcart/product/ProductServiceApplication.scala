package com.fullcart.product

import com.fullcart.product.controller.ProductController
import com.fullcart.session.Webshop.ProductSession.ProductSession._
import com.fullcart.session.Webshop.ProductSession.statechans.P.ProductSession_P_1
import com.fullcart.session.Webshop.ProductSession.{ProductSession, roles}
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


object ProductServiceApplication {

  val PortProperty = "fullcart.product-service.port"

  def main(args: Array[String]): Unit = {
    val context = SpringApplication.run(classOf[ApplicationConfig])

    val productController = context.getBean(classOf[ProductController])
    val env = context.getBean(classOf[Environment])

    val port = env.getProperty(PortProperty).toInt

    startServer(productController, port)
  }

  private def startServer(productController: ProductController, port: Int): Unit = {
    val ss = new SocketChannelServer(port)

    try {
      while (true) {
        val session = new ProductSession()

        try {
          val server = new MPSTEndpoint[ProductSession, roles.P](session, P, new ObjectStreamFormatter())

          server.accept(ss, C)

          productController.start(server, new ProductSession_P_1(server))
        } catch {
          case e@(_: ScribRuntimeException | _: IOException) => e.printStackTrace()
        }
      }

    } finally {
      ss.close()
    }
  }
}
