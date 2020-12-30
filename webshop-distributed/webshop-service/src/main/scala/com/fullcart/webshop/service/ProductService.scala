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
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component

@Component
class ProductService {

  @Value("${fullcart.product-service.host}")
  private val Host: String = ""

  @Value("${fullcart.product-service.port}")
  private val Port: Int = 0

  def findOne(id: Long): (HttpStatus, Option[ProductDTO]) = {
    execute { client =>
      val (state, status, result) = findOne(new ProductSession_C_1(client), id)
      state.send(P, Bye)
      (status, result)
    }
  }

  private def findOne(state: ProductSession_C_1, id: Long): (ProductSession_C_1, HttpStatus, Option[ProductDTO]) = {
    val receivedProduct = new Buf[ProductDTO](null)

    val cases = state
      .send(P, GetOne, id)
      .branch(P)

    cases.op.name() match {
      case "Ok" => (
        cases.receive(P, Ok, receivedProduct),
        HttpStatus.OK,
        Some(receivedProduct.`val`)
      )
      case "NotFound" => (
        cases.receive(P, NotFound),
        HttpStatus.NOT_FOUND,
        None
      )
    }
  }

  def findAll(): java.util.List[ProductDTO] = {
    execute { client =>
      val products: Buf[java.util.List[_]] = new Buf(null)

      new ProductSession_C_1(client)
        .send(P, GetAll)
        .receive(P, Ok, products)
        .send(P, Bye)

      products.`val`.asInstanceOf[java.util.List[ProductDTO]]
    }
  }

  def create(product: ProductDTO): (HttpStatus, Either[String, ProductDTO]) = {
    execute { client =>
      val (state, status, result) = create(new ProductSession_C_1(client), product)
      state.send(P, Bye)
      (status, result)
    }
  }

  private def create(state: ProductSession_C_1, product: ProductDTO): (ProductSession_C_1, HttpStatus, Either[String, ProductDTO]) = {
    val receivedProduct = new Buf[ProductDTO](null)
    val errorMessage = new Buf[String](null)

    val cases = state
      .send(P, Create, product)
      .branch(P)

    cases.op.name() match {
      case "Ok" => (
        cases.receive(P, Ok, receivedProduct),
        HttpStatus.CREATED,
        Right(receivedProduct.`val`)
      )
      case "Err" => (
        cases.receive(P, Err, errorMessage),
        HttpStatus.BAD_REQUEST,
        Left(errorMessage.`val`)
      )
    }
  }

  def update(id: Long, product: ProductDTO): (HttpStatus, Option[Either[String, ProductDTO]]) = {
    execute { client =>
      val (state, status, result) = update(new ProductSession_C_1(client), id, product)
      state.send(P, Bye)
      (status, result)
    }
  }

  private def update(state: ProductSession_C_1, id: Long, product: ProductDTO): (ProductSession_C_1, HttpStatus, Option[Either[String, ProductDTO]]) = {
    val receivedProduct = new Buf[ProductDTO](null)
    val errorMessage = new Buf[String](null)

    val cases = state
      .send(P, Update, id, product)
      .branch(P)

    cases.op.name() match {
      case "NotFound" => (
        cases.receive(P, NotFound),
        HttpStatus.NOT_FOUND,
        None
      )
      case "Err" => (
        cases.receive(P, Err, errorMessage),
        HttpStatus.BAD_REQUEST,
        Some(Left(errorMessage.`val`))
      )
      case "Ok" => (
        cases.receive(P, Ok, receivedProduct),
        HttpStatus.OK,
        Some(Right(receivedProduct.`val`))
      )
    }
  }

  def replace(id: Long, product: ProductDTO): (HttpStatus, Either[String, ProductDTO]) = {
    execute { client =>
      val (state, status, result) = replace(new ProductSession_C_1(client), id, product)
      state.send(P, Bye)
      (status, result)
    }
  }

  private def execute[T](f: MPSTEndpoint[ProductSession, roles.C] => T): T = {
    val session = new ProductSession()
    val client = new MPSTEndpoint[ProductSession, roles.C](session, C, new ObjectStreamFormatter())

    try {
      client.request(P, () => new SocketChannelEndpoint(), Host, Port)

      f(client)
    } catch {
      case e: Exception =>
        Logger.error(e.getMessage, e)
        throw e;
    } finally {
      client.close()
    }
  }

  private def replace(state: ProductSession_C_1, id: Long, product: ProductDTO): (ProductSession_C_1, HttpStatus, Either[String, ProductDTO]) = {
    val receivedProduct = new Buf[ProductDTO](null)
    val errorMessage = new Buf[String](null)

    val cases = state
      .send(P, Replace, id, product)
      .branch(P)

    cases.op.name() match {
      case "Err" => (
        cases.receive(P, Err, errorMessage),
        HttpStatus.BAD_REQUEST,
        Left(errorMessage.`val`)
      )
      case "Created" => (
        cases.receive(P, Created, receivedProduct),
        HttpStatus.CREATED,
        Right(receivedProduct.`val`)
      )
      case "Ok" => (
        cases.receive(P, Ok, receivedProduct),
        HttpStatus.OK,
        Right(receivedProduct.`val`)
      )
    }
  }

  def delete(id: Long): HttpStatus = {
    execute { client =>
      val (state, status) = delete(new ProductSession_C_1(client), id)
      state.send(P, Bye)
      status
    }
  }

  private def delete(state: ProductSession_C_1, id: Long): (ProductSession_C_1, HttpStatus) = {
    val cases = state
      .send(P, Delete, id)
      .branch(P)

    cases.op.name() match {
      case "Ok" => (
        cases.receive(P, Ok),
        HttpStatus.NO_CONTENT
      )
      case "NotFound" => (
        cases.receive(P, NotFound),
        HttpStatus.NOT_FOUND
      )
    }
  }
}

@Component
object ProductService {
  private val Logger = LoggerFactory.getLogger(classOf[ProductService])
}
