package com.fullcart.product.controller

import com.fullcart.dto.ProductDTO
import com.fullcart.product.model.Product
import com.fullcart.product.repository.ProductRepository
import com.fullcart.session.AbstractController
import com.fullcart.session.Webshop.ProductSession.ProductSession._
import com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces.Branch_P_C_Bye__C_Create_Product__C_GetOne_Long.{Branch_P_C_Bye__C_Create_Product__C_GetOne_Long_Enum => Ops}
import com.fullcart.session.Webshop.ProductSession.statechans.P.{ProductSession_P_1, ProductSession_P_1_Cases}
import com.fullcart.session.Webshop.ProductSession.{ProductSession, roles}
import org.scribble.runtime.util.Buf
import org.springframework.stereotype.Component

@Component
class ProductController(private val productRepository: ProductRepository) extends AbstractController[ProductSession, roles.P, ProductSession_P_1] {

  override def handleRequests(initialState: ProductSession_P_1): Unit = {
    var state = initialState

    while (true) {
      val cases = state.branch(C)

      cases.op match {
        case Ops.GetOne =>
          state = handleGetOne(cases)
        case Ops.Create =>
          state = handleCreate(cases)
        case Ops.Bye =>
          handleBye(cases)
          return
      }
    }
  }

  private def handleCreate(state: ProductSession_P_1_Cases): ProductSession_P_1 = {
    val dto = new Buf[ProductDTO]()
    val newState = state.receive(Create, dto)

    val product = productRepository.save(Product.fromDto(dto.`val`))

    newState.send(C, One, Product.toDto(product))
  }

  private def handleGetOne(state: ProductSession_P_1_Cases): ProductSession_P_1 = {
    val productId = new Buf[java.lang.Long]()
    val newState = state.receive(GetOne, productId)

    val product = productRepository.findById(productId.`val`).orElse(null)

    newState.send(C, One, Product.toDto(product))
  }

  private def handleBye(state: ProductSession_P_1_Cases): Unit = {
    state
      .receive(Bye)
      .send(C, Bye)
  }
}
