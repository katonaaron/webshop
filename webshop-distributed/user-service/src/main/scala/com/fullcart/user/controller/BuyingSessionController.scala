package com.fullcart.user.controller

import com.fullcart.session.AbstractController
import com.fullcart.session.Webshop.BuyingSession.BuyingSession._
import com.fullcart.session.Webshop.BuyingSession.statechans.U.{BuyingSession_U_1, BuyingSession_U_1_Cases}
import com.fullcart.session.Webshop.BuyingSession.{BuyingSession, roles}
import com.fullcart.user.service.UserService
import org.scribble.runtime.util.Buf
import org.springframework.stereotype.Component

@Component
class BuyingSessionController(private val userService: UserService) extends AbstractController[BuyingSession, roles.U, BuyingSession_U_1] {

  override def handleRequests(initialState: BuyingSession_U_1): Unit = {
    var state = initialState

    while (true) {
      val cases = state.branch(B)

      cases.op.name() match {
        case "GetOne" =>
          state = handleGetOne(cases)
        case "Bye" =>
          handleBye(cases)
          return
      }
    }
  }

  private def handleGetOne(state: BuyingSession_U_1_Cases): BuyingSession_U_1 = {
    val userId = new Buf[java.lang.Long]()
    val newState = state.receive(GetOne, userId)

    userService
      .findById(userId.`val`)
    match {
      case Some(user) => newState.send(B, Ok, user)
      case _ => newState.send(B, NotFound, userId.`val`)
    }
  }

  private def handleBye(state: BuyingSession_U_1_Cases): Unit = {
    state
      .receive(Bye)
  }
}
