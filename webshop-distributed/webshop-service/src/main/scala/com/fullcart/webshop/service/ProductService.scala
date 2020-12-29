package com.fullcart.webshop.service

import com.fullcart.dto.ProductDTO
import com.fullcart.session.Webshop.ProductSession.ProductSession._
import com.fullcart.session.Webshop.ProductSession.statechans.C.ProductSession_C_1
import com.fullcart.session.Webshop.ProductSession.{ProductSession, roles}
import com.fullcart.webshop.service.ProductService.Logger
import org.scribble.runtime.message.ObjectStreamFormatter
import org.scribble.runtime.net.SocketChannelEndpoint
import org.scribble.runtime.session.MPSTEndpoint
import org.scribble.runtime.util.Buf
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class ProductService {

  @Value("${fullcart.product-service.host}")
  private val Host: String = ""

  @Value("${fullcart.product-service.port}")
  private val Port: Int = 0

  def getOne(id: Long): Option[ProductDTO] = {
    val session = new ProductSession()
    val client = new MPSTEndpoint[ProductSession, roles.C](session, C, new ObjectStreamFormatter())
    val product = new Buf[ProductDTO](null)

    try {
      client.request(P, () => new SocketChannelEndpoint(), Host, Port)

      new ProductSession_C_1(client)
        .send(P, GetOne, id)
        .receive(P, One, product)
        .send(P, Bye)
        .receive(P, Bye)

      Some(product.`val`)
    } catch {
      case e: Exception =>
        Logger.error(e.getMessage, e)
        throw e;
    } finally {
      client.close()
    }
  }

  def create(product: ProductDTO): Option[ProductDTO] = {
    val session = new ProductSession()
    val client = new MPSTEndpoint[ProductSession, roles.C](session, C, new ObjectStreamFormatter())
    val receivedProduct = new Buf[ProductDTO](null)

    try {
      client.request(P, () => new SocketChannelEndpoint(), Host, Port)

      new ProductSession_C_1(client)
        .send(P, Create, product)
        .receive(P, One, receivedProduct)
        .send(P, Bye)
        .receive(P, Bye)

      Some(receivedProduct.`val`)
    } catch {
      case e: Exception =>
        Logger.error(e.getMessage, e)
        throw e;
    } finally {
      client.close()
    }
  }
}

@Component
object ProductService {
  private val Logger = LoggerFactory.getLogger(classOf[ProductService])
}
