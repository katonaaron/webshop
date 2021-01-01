package com.fullcart.buying.controller

import com.fullcart.buying.service.{OrderService, StatusNotAllowed, StatusNotFound}
import com.fullcart.dto.{OrderDTO, ProductDTO, UserDTO}
import com.fullcart.session.AbstractController
import com.fullcart.session.Webshop.BuyingSession.BuyingSession._
import com.fullcart.session.Webshop.BuyingSession.statechans.B.{BuyingSession_B_1, BuyingSession_B_1_Cases}
import com.fullcart.session.Webshop.BuyingSession.{BuyingSession, roles}
import org.scribble.runtime.util.Buf
import org.springframework.stereotype.Component

import scala.jdk.CollectionConverters.IterableHasAsScala

@Component
class BuyingSessionController(private val orderService: OrderService) extends AbstractController[BuyingSession, roles.B, BuyingSession_B_1] {

  override def handleRequests(initialState: BuyingSession_B_1): Unit = {
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
        case "Cancel" =>
          state = handleCancel(cases)
        case "Complete" =>
          state = handleComplete(cases)
        case "Bye" =>
          handleBye(cases)
          return
      }
    }
  }

  private def handleGetAll(state: BuyingSession_B_1_Cases): BuyingSession_B_1 =
    state
      .receive(C, GetAll)
      .send(C, Ok, orderService.findAll())

  private def handleGetOne(state: BuyingSession_B_1_Cases): BuyingSession_B_1 = {
    val orderId = new Buf[java.lang.Long]()
    val newState = state.receive(GetOne, orderId)

    orderService
      .findById(orderId.`val`)
    match {
      case Some(order) => newState.send(C, Ok, order)
      case _ => newState.send(C, NotFound)
    }
  }

  private def handleCreate(state: BuyingSession_B_1_Cases): BuyingSession_B_1 = {
    val receivedOrder = new Buf[OrderDTO]()

    val receivedId = new Buf[java.lang.Long]()

    val receivedUser = new Buf[UserDTO]()
    val receivedProducts: Buf[java.lang.Iterable[_]] = new Buf(null)

    val nextState = state
      .receive(C, Create, receivedOrder)

    val dto = receivedOrder.`val`

    // TODO: Validation method
    (dto.userId, dto.productIds) match {
      case (None, _) => nextState.send(C, Err, "Missing user")
      case (_, None) => nextState.send(C, Err, "Missing products")
      case (_, Some(productIds)) if productIds.asScala.isEmpty => nextState.send(C, Err, "Must specify at least one product")
      case (Some(userId), Some(productIds)) =>
        val userCases = nextState
          .send(U, GetOne, userId)
          .branch(U)

        userCases.op.name() match {
          case "NotFound" => userCases
            .receive(U, NotFound, receivedId)
            .send(C, UserNotFound, receivedId.`val`)
          case "Ok" =>
            val productCases = userCases
              .receive(U, Ok, receivedUser)
              .send(P, GetAll, productIds)
              .branch(P)

            productCases.op.name() match {
              case "NotFound" => productCases
                .receive(P, NotFound, receivedId)
                .send(C, ProductNotFound, receivedId.`val`)
              case "Ok" =>
                val state = productCases.receive(P, Ok, receivedProducts)
                val savedOrder = orderService.create(receivedUser.`val`, receivedProducts.`val`.asInstanceOf[java.lang.Iterable[ProductDTO]].asScala)
                state.send(C, Ok, savedOrder)
            }
        }

    }
  }

  private def handleCancel(state: BuyingSession_B_1_Cases): BuyingSession_B_1 = {
    val orderId = new Buf[java.lang.Long]()
    val newState = state.receive(C, Cancel, orderId)

    orderService
      .cancel(orderId.`val`)
    match {
      case Left(StatusNotFound()) => newState.send(C, NotFound)
      case Left(StatusNotAllowed()) => newState.send(C, NotAllowed)
      case Right(order) => newState.send(C, Ok, order)
    }
  }

  private def handleComplete(state: BuyingSession_B_1_Cases): BuyingSession_B_1 = {
    val orderId = new Buf[java.lang.Long]()
    val newState = state.receive(C, Complete, orderId)

    orderService
      .complete(orderId.`val`)
    match {
      case Left(StatusNotFound()) => newState.send(C, NotFound)
      case Left(StatusNotAllowed()) => newState.send(C, NotAllowed)
      case Right(order) => newState.send(C, Ok, order)
    }
  }

  private def handleBye(state: BuyingSession_B_1_Cases): Unit = {
    state
      .receive(Bye)
      .send(P, Bye)
      .send(U, Bye)
  }
}
