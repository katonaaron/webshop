package com.fullcart.buying.server

import com.fullcart.buying.controller.BuyingSessionController
import com.fullcart.session.Webshop.BuyingSession.BuyingSession._
import com.fullcart.session.Webshop.BuyingSession.statechans.B.BuyingSession_B_1
import com.fullcart.session.Webshop.BuyingSession.{BuyingSession, roles}
import org.scribble.main.ScribRuntimeException
import org.scribble.runtime.message.ObjectStreamFormatter
import org.scribble.runtime.net.{SocketChannelEndpoint, SocketChannelServer}
import org.scribble.runtime.session.MPSTEndpoint
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

import java.io.IOException

@Component
class BuyingSessionServer(private val buyingController: BuyingSessionController) extends Thread {

  @Value("${fullcart.buying-session.buying-service.port}")
  private val Port: Int = 0

  @Value("${fullcart.buying-session.product-service.host}")
  private val HostP: String = ""

  @Value("${fullcart.buying-session.product-service.port}")
  private val PortP: Int = 0

  @Value("${fullcart.buying-session.user-service.host}")
  private val HostU: String = ""

  @Value("${fullcart.buying-session.user-service.port}")
  private val PortU: Int = 0

  override def run(): Unit = {
    val ss = new SocketChannelServer(Port)

    try {
      while (true) {
        val session = new BuyingSession()

        try {
          val server = new MPSTEndpoint[BuyingSession, roles.B](session, B, new ObjectStreamFormatter())

          server.accept(ss, C)
          server.request(P, () => new SocketChannelEndpoint(), HostP, PortP)
          server.request(U, () => new SocketChannelEndpoint(), HostU, PortU)

          buyingController.start(server, new BuyingSession_B_1(server))
        } catch {
          case e@(_: ScribRuntimeException | _: IOException) => e.printStackTrace()
        }
      }

    } finally {
      ss.close()
    }
  }

}
