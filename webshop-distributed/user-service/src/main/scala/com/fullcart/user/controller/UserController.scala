package com.fullcart.user.controller

import com.fullcart.dto.UserDTO
import com.fullcart.session.AbstractController
import com.fullcart.session.Webshop.UserSession.UserSession._
import com.fullcart.session.Webshop.UserSession.statechans.U.{UserSession_U_1, UserSession_U_1_Cases}
import com.fullcart.session.Webshop.UserSession.{UserSession, roles}
import com.fullcart.user.service.UserService
import org.scribble.runtime.util.Buf
import org.springframework.stereotype.Component

@Component
class UserController(private val userService: UserService) extends AbstractController[UserSession, roles.U, UserSession_U_1] {
  override def handleRequests(initialState: UserSession_U_1): Unit = {
    var state = initialState

    while (true) {
      val cases = state.branch(C)

      cases.op.name() match {
        case "GetAll" =>
          state = handleGetAll(cases)
        case "GetOne" =>
          state = handleGetOne(cases)
        case "Create" =>
          state = handleCreate(cases)
        case "Update" =>
          state = handleUpdate(cases)
        case "Replace" =>
          state = handleReplace(cases)
        case "Delete" =>
          state = handleDelete(cases)
        case "Bye" =>
          handleBye(cases)
          return
      }
    }
  }

  private def handleGetAll(state: UserSession_U_1_Cases): UserSession_U_1 =
    state
      .receive(C, GetAll)
      .send(C, Ok, userService.findAll())

  private def handleGetOne(state: UserSession_U_1_Cases): UserSession_U_1 = {
    val userId = new Buf[java.lang.Long]()
    val newState = state.receive(GetOne, userId)

    userService
      .findById(userId.`val`)
    match {
      case Some(user) => newState.send(C, Ok, user)
      case _ => newState.send(C, NotFound)
    }
  }

  private def handleCreate(state: UserSession_U_1_Cases): UserSession_U_1 = {
    val receivedUser = new Buf[UserDTO]()
    val newState = state.receive(Create, receivedUser)

    userService
      .create(receivedUser.`val`)
    match {
      case Left(error) => newState.send(C, Err, error)
      case Right(user) => newState.send(C, Ok, user)
    }
  }

  private def handleUpdate(state: UserSession_U_1_Cases): UserSession_U_1 = {
    val userId = new Buf[java.lang.Long]()
    val receivedUser = new Buf[UserDTO]()
    val newState = state.receive(Update, userId, receivedUser)

    userService
      .update(userId.`val`, receivedUser.`val`)
    match {
      case None => newState.send(C, NotFound)
      case Some(Left(error)) => newState.send(C, Err, error)
      case Some(Right(user)) => newState.send(C, Ok, user)
    }
  }

  private def handleReplace(state: UserSession_U_1_Cases): UserSession_U_1 = {
    val userId = new Buf[java.lang.Long]()
    val receivedUser = new Buf[UserDTO]()
    val newState = state.receive(Replace, userId, receivedUser)

    val id = userId.`val`
    val newUser = receivedUser.`val`

    val isCreated = userService
      .findById(id)
      .isEmpty

    userService.replace(id, newUser)
    match {
      case Left(error) => newState.send(C, Err, error)
      case Right(user) =>
        if (isCreated)
          newState.send(C, Created, user)
        else
          newState.send(C, Ok, user)
    }
  }


  private def handleDelete(state: UserSession_U_1_Cases): UserSession_U_1 = {
    val userId = new Buf[java.lang.Long]()
    val newState = state.receive(Delete, userId)

    if (userService.deleteById(userId.`val`)) {
      newState.send(C, Ok)
    } else {
      newState.send(C, NotFound)
    }
  }


  private def handleBye(state: UserSession_U_1_Cases): Unit = {
    state
      .receive(Bye)
  }
}
