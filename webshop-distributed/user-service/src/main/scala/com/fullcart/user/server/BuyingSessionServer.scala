package com.fullcart.user.server


import com.fullcart.session.Webshop.BuyingSession.BuyingSession._
import com.fullcart.session.Webshop.BuyingSession.statechans.U.BuyingSession_U_1
import com.fullcart.session.Webshop.BuyingSession.{BuyingSession, roles}
import com.fullcart.user.controller.BuyingSessionController
import org.scribble.main.ScribRuntimeException
import org.scribble.runtime.message.ObjectStreamFormatter
import org.scribble.runtime.net.SocketChannelServer
import org.scribble.runtime.session.MPSTEndpoint
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

import java.io.IOException

@Component
class BuyingSessionServer(private val controller: BuyingSessionController) extends Thread {
  @Value("${fullcart.buying-session.user-service.port}")
  private val Port: Int = 0

  override def run(): Unit = {
    val ss = new SocketChannelServer(Port)

    try {
      while (true) {
        val session = new BuyingSession()

        try {
          val server = new MPSTEndpoint[BuyingSession, roles.U](session, U, new ObjectStreamFormatter())

          server.accept(ss, B)

          controller.start(server, new BuyingSession_U_1(server))
        } catch {
          case e@(_: ScribRuntimeException | _: IOException) => e.printStackTrace()
        }
      }

    } finally {
      ss.close()
    }
  }
}
