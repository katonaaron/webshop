package com.fullcart.webshop.service

import com.fullcart.dto.UserDTO
import com.fullcart.session.Webshop.UserSession.UserSession._
import com.fullcart.session.Webshop.UserSession.statechans.C.UserSession_C_1
import com.fullcart.session.Webshop.UserSession.{UserSession, roles}
import org.scribble.runtime.message.ObjectStreamFormatter
import org.scribble.runtime.net.SocketChannelEndpoint
import org.scribble.runtime.session.MPSTEndpoint
import org.scribble.runtime.util.Buf
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component

@Component
class UserService {

  @Value("${fullcart.user-service.host}")
  private val Host: String = ""

  @Value("${fullcart.user-service.port}")
  private val Port: Int = 0

  private val Logger = LoggerFactory.getLogger(classOf[UserService])

  def findOne(id: Long): (HttpStatus, Option[UserDTO]) = {
    execute { client =>
      val (state, status, result) = findOne(new UserSession_C_1(client), id)
      state.send(U, Bye)
      (status, result)
    }
  }

  private def findOne(state: UserSession_C_1, id: Long): (UserSession_C_1, HttpStatus, Option[UserDTO]) = {
    val receivedUser = new Buf[UserDTO](null)

    val cases = state
      .send(U, GetOne, id)
      .branch(U)

    cases.op.name() match {
      case "Ok" => (
        cases.receive(U, Ok, receivedUser),
        HttpStatus.OK,
        Some(receivedUser.`val`)
      )
      case "NotFound" => (
        cases.receive(U, NotFound),
        HttpStatus.NOT_FOUND,
        None
      )
    }
  }

  def findAll(): java.lang.Iterable[UserDTO] = {
    execute { client =>
      val users: Buf[java.lang.Iterable[_]] = new Buf(null)

      new UserSession_C_1(client)
        .send(U, GetAll)
        .receive(U, Ok, users)
        .send(U, Bye)

      users.`val`.asInstanceOf[java.lang.Iterable[UserDTO]]
    }
  }

  def create(user: UserDTO): (HttpStatus, Either[String, UserDTO]) = {
    execute { client =>
      val (state, status, result) = create(new UserSession_C_1(client), user)
      state.send(U, Bye)
      (status, result)
    }
  }

  private def create(state: UserSession_C_1, user: UserDTO): (UserSession_C_1, HttpStatus, Either[String, UserDTO]) = {
    val receivedUser = new Buf[UserDTO](null)
    val errorMessage = new Buf[String](null)

    val cases = state
      .send(U, Create, user)
      .branch(U)

    cases.op.name() match {
      case "Ok" => (
        cases.receive(U, Ok, receivedUser),
        HttpStatus.CREATED,
        Right(receivedUser.`val`)
      )
      case "Err" => (
        cases.receive(U, Err, errorMessage),
        HttpStatus.BAD_REQUEST,
        Left(errorMessage.`val`)
      )
    }
  }

  private def execute[T](f: MPSTEndpoint[UserSession, roles.C] => T): T = {
    val session = new UserSession()
    val client = new MPSTEndpoint[UserSession, roles.C](session, C, new ObjectStreamFormatter())

    try {
      client.request(U, () => new SocketChannelEndpoint(), Host, Port)

      f(client)
    } catch {
      case e: Exception =>
        Logger.error(e.getMessage, e)
        throw e;
    } finally {
      client.close()
    }
  }

  def update(id: Long, user: UserDTO): (HttpStatus, Option[Either[String, UserDTO]]) = {
    execute { client =>
      val (state, status, result) = update(new UserSession_C_1(client), id, user)
      state.send(U, Bye)
      (status, result)
    }
  }

  private def update(state: UserSession_C_1, id: Long, user: UserDTO): (UserSession_C_1, HttpStatus, Option[Either[String, UserDTO]]) = {
    val receivedUser = new Buf[UserDTO](null)
    val errorMessage = new Buf[String](null)

    val cases = state
      .send(U, Update, id, user)
      .branch(U)

    cases.op.name() match {
      case "NotFound" => (
        cases.receive(U, NotFound),
        HttpStatus.NOT_FOUND,
        None
      )
      case "Err" => (
        cases.receive(U, Err, errorMessage),
        HttpStatus.BAD_REQUEST,
        Some(Left(errorMessage.`val`))
      )
      case "Ok" => (
        cases.receive(U, Ok, receivedUser),
        HttpStatus.OK,
        Some(Right(receivedUser.`val`))
      )
    }
  }

  def replace(id: Long, user: UserDTO): (HttpStatus, Either[String, UserDTO]) = {
    execute { client =>
      val (state, status, result) = replace(new UserSession_C_1(client), id, user)
      state.send(U, Bye)
      (status, result)
    }
  }

  private def replace(state: UserSession_C_1, id: Long, user: UserDTO): (UserSession_C_1, HttpStatus, Either[String, UserDTO]) = {
    val receivedUser = new Buf[UserDTO](null)
    val errorMessage = new Buf[String](null)

    val cases = state
      .send(U, Replace, id, user)
      .branch(U)

    cases.op.name() match {
      case "Err" => (
        cases.receive(U, Err, errorMessage),
        HttpStatus.BAD_REQUEST,
        Left(errorMessage.`val`)
      )
      case "Created" => (
        cases.receive(U, Created, receivedUser),
        HttpStatus.CREATED,
        Right(receivedUser.`val`)
      )
      case "Ok" => (
        cases.receive(U, Ok, receivedUser),
        HttpStatus.OK,
        Right(receivedUser.`val`)
      )
    }
  }

  def delete(id: Long): HttpStatus = {
    execute { client =>
      val (state, status) = delete(new UserSession_C_1(client), id)
      state.send(U, Bye)
      status
    }
  }

  private def delete(state: UserSession_C_1, id: Long): (UserSession_C_1, HttpStatus) = {
    val cases = state
      .send(U, Delete, id)
      .branch(U)

    cases.op.name() match {
      case "Ok" => (
        cases.receive(U, Ok),
        HttpStatus.NO_CONTENT
      )
      case "NotFound" => (
        cases.receive(U, NotFound),
        HttpStatus.NOT_FOUND
      )
    }
  }
}
