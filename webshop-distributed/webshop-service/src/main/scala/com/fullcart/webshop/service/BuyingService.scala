package com.fullcart.webshop.service

import com.fullcart.dto.OrderDTO
import com.fullcart.session.Webshop.BuyingSession.BuyingSession._
import com.fullcart.session.Webshop.BuyingSession.statechans.C.BuyingSession_C_1
import com.fullcart.session.Webshop.BuyingSession.{BuyingSession, roles}
import org.scribble.runtime.message.ObjectStreamFormatter
import org.scribble.runtime.net.SocketChannelEndpoint
import org.scribble.runtime.session.MPSTEndpoint
import org.scribble.runtime.util.Buf
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component

@Component
class BuyingService {

  @Value("${fullcart.buying-service.host}")
  private val Host: String = ""

  @Value("${fullcart.buying-service.port}")
  private val Port: Int = 0

  private val Logger = LoggerFactory.getLogger(classOf[BuyingService])

  def findOne(id: Long): (HttpStatus, Option[OrderDTO]) = {
    execute { client =>
      val (state, status, result) = findOne(new BuyingSession_C_1(client), id)
      state.send(B, Bye)
      (status, result)
    }
  }

  private def findOne(state: BuyingSession_C_1, id: Long): (BuyingSession_C_1, HttpStatus, Option[OrderDTO]) = {
    val receivedOrder = new Buf[OrderDTO]()

    val cases = state
      .send(B, GetOne, id)
      .branch(B)

    cases.op.name() match {
      case "Ok" => (
        cases.receive(B, Ok, receivedOrder),
        HttpStatus.OK,
        Some(receivedOrder.`val`)
      )
      case "NotFound" => (
        cases.receive(B, NotFound),
        HttpStatus.NOT_FOUND,
        None
      )
    }
  }

  def findAll(): java.lang.Iterable[OrderDTO] = {
    execute { client =>
      val orders: Buf[java.lang.Iterable[_]] = new Buf(null)

      new BuyingSession_C_1(client)
        .send(B, GetAll)
        .receive(B, Ok, orders)
        .send(B, Bye)

      orders.`val`.asInstanceOf[java.lang.Iterable[OrderDTO]]
    }
  }

  def create(order: OrderDTO): (HttpStatus, Either[String, OrderDTO]) = {
    execute { client =>
      val (state, status, result) = create(new BuyingSession_C_1(client), order)
      state.send(B, Bye)
      (status, result)
    }
  }

  private def create(state: BuyingSession_C_1, order: OrderDTO): (BuyingSession_C_1, HttpStatus, Either[String, OrderDTO]) = {
    val receivedOrder = new Buf[OrderDTO]()
    val receivedId = new Buf[java.lang.Long](null)
    val errorMessage = new Buf[String]()

    val cases = state
      .send(B, Create, order)
      .branch(B)

    cases.op.name() match {
      case "Ok" => (
        cases.receive(B, Ok, receivedOrder),
        HttpStatus.CREATED,
        Right(receivedOrder.`val`)
      )
      case "Err" => (
        cases.receive(B, Err, errorMessage),
        HttpStatus.BAD_REQUEST,
        Left(errorMessage.`val`)
      )
      case "ProductNotFound" => (
        cases.receive(B, ProductNotFound, receivedId),
        HttpStatus.NOT_FOUND,
        Left(s"Product with id '${receivedId.`val`}' not found")
      )
      case "UserNotFound" => (
        cases.receive(B, UserNotFound, receivedId),
        HttpStatus.NOT_FOUND,
        Left(s"User with id '${receivedId.`val`}' not found")
      )
    }
  }

  def cancel(id: Long): (HttpStatus, Option[OrderDTO]) = {
    execute { client =>
      val (state, status, result) = cancel(new BuyingSession_C_1(client), id)
      state.send(B, Bye)
      (status, result)
    }
  }

  private def execute[T](f: MPSTEndpoint[BuyingSession, roles.C] => T): T = {
    val session = new BuyingSession()
    val client = new MPSTEndpoint[BuyingSession, roles.C](session, C, new ObjectStreamFormatter())

    try {
      client.request(B, () => new SocketChannelEndpoint(), Host, Port)

      f(client)
    } catch {
      case e: Exception =>
        Logger.error(e.getMessage, e)
        throw e;
    } finally {
      client.close()
    }
  }

  private def cancel(state: BuyingSession_C_1, id: Long): (BuyingSession_C_1, HttpStatus, Option[OrderDTO]) = {
    val receivedOrder = new Buf[OrderDTO]()

    val cases = state
      .send(B, Cancel, id)
      .branch(B)

    cases.op.name() match {
      case "Ok" => (
        cases.receive(B, Ok, receivedOrder),
        HttpStatus.OK,
        Some(receivedOrder.`val`)
      )
      case "NotFound" => (
        cases.receive(B, NotFound),
        HttpStatus.NOT_FOUND,
        None
      )
      case "NotAllowed" => (
        cases.receive(B, NotAllowed),
        HttpStatus.METHOD_NOT_ALLOWED,
        None
      )
    }
  }

  def complete(id: Long): (HttpStatus, Option[OrderDTO]) = {
    execute { client =>
      val (state, status, result) = complete(new BuyingSession_C_1(client), id)
      state.send(B, Bye)
      (status, result)
    }
  }

  private def complete(state: BuyingSession_C_1, id: Long): (BuyingSession_C_1, HttpStatus, Option[OrderDTO]) = {
    val receivedOrder = new Buf[OrderDTO]()

    val cases = state
      .send(B, Complete, id)
      .branch(B)

    cases.op.name() match {
      case "Ok" => (
        cases.receive(B, Ok, receivedOrder),
        HttpStatus.OK,
        Some(receivedOrder.`val`)
      )
      case "NotFound" => (
        cases.receive(B, NotFound),
        HttpStatus.NOT_FOUND,
        None
      )
      case "NotAllowed" => (
        cases.receive(B, NotAllowed),
        HttpStatus.METHOD_NOT_ALLOWED,
        None
      )
    }
  }
}
