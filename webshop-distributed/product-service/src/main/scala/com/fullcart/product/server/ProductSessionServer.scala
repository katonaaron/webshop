package com.fullcart.product.server

import com.fullcart.product.controller.ProductSessionController
import com.fullcart.session.Webshop.ProductSession.ProductSession.{C, P}
import com.fullcart.session.Webshop.ProductSession.statechans.P.ProductSession_P_1
import com.fullcart.session.Webshop.ProductSession.{ProductSession, roles}
import org.scribble.main.ScribRuntimeException
import org.scribble.runtime.message.ObjectStreamFormatter
import org.scribble.runtime.net.SocketChannelServer
import org.scribble.runtime.session.MPSTEndpoint
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

import java.io.IOException

@Component
class ProductSessionServer(private val controller: ProductSessionController) extends Thread {

  @Value("${fullcart.product-session.product-service.port}")
  private val Port: Int = 0

  override def run(): Unit = {
    val ss = new SocketChannelServer(Port)

    try {
      while (true) {
        val session = new ProductSession()

        try {
          val server = new MPSTEndpoint[ProductSession, roles.P](session, P, new ObjectStreamFormatter())

          server.accept(ss, C)

          controller.start(server, new ProductSession_P_1(server))
        } catch {
          case e@(_: ScribRuntimeException | _: IOException) => e.printStackTrace()
        }
      }

    } finally {
      ss.close()
    }
  }
}
