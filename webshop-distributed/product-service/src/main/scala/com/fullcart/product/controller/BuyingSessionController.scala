package com.fullcart.product.controller

import com.fullcart.product.service.ProductService
import com.fullcart.session.AbstractController
import com.fullcart.session.Webshop.BuyingSession.BuyingSession._
import com.fullcart.session.Webshop.BuyingSession.statechans.P.{BuyingSession_P_1, BuyingSession_P_1_Cases}
import com.fullcart.session.Webshop.BuyingSession.{BuyingSession, roles}
import org.scribble.runtime.util.Buf
import org.springframework.stereotype.Component

@Component
class BuyingSessionController(private val productService: ProductService) extends AbstractController[BuyingSession, roles.P, BuyingSession_P_1] {

  override def handleRequests(initialState: BuyingSession_P_1): Unit = {
    var state = initialState

    while (true) {
      val cases = state.branch(B)

      cases.op.name() match {
        case "GetAll" =>
          state = handleGetAll(cases)
        case "Bye" =>
          handleBye(cases)
          return
      }
    }
  }

  private def handleGetAll(state: BuyingSession_P_1_Cases): BuyingSession_P_1 = {
    val receivedProductIds = new Buf[java.lang.Iterable[_]](null)

    val newState = state.receive(B, GetAll, receivedProductIds)

    productService.findAllById(receivedProductIds.`val`.asInstanceOf[java.lang.Iterable[Long]])
    match {
      case Left(id) => newState.send(B, NotFound, id)
      case Right(products) => newState.send(B, Ok, products)
    }
  }

  private def handleBye(state: BuyingSession_P_1_Cases): Unit = {
    state
      .receive(Bye)
  }
}
