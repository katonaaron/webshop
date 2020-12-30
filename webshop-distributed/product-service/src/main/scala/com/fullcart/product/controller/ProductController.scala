package com.fullcart.product.controller

import com.fullcart.dto.ProductDTO
import com.fullcart.product.service.ProductService
import com.fullcart.session.AbstractController
import com.fullcart.session.Webshop.ProductSession.ProductSession._
import com.fullcart.session.Webshop.ProductSession.statechans.P.{ProductSession_P_1, ProductSession_P_1_Cases}
import com.fullcart.session.Webshop.ProductSession.{ProductSession, roles}
import org.scribble.runtime.util.Buf
import org.springframework.stereotype.Component

@Component
class ProductController(private val productService: ProductService) extends AbstractController[ProductSession, roles.P, ProductSession_P_1] {

  override def handleRequests(initialState: ProductSession_P_1): Unit = {
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

  private def handleGetAll(state: ProductSession_P_1_Cases): ProductSession_P_1 =
    state
      .receive(C, GetAll)
      .send(C, Ok, productService.findAll())

  private def handleGetOne(state: ProductSession_P_1_Cases): ProductSession_P_1 = {
    val productId = new Buf[java.lang.Long]()
    val newState = state.receive(GetOne, productId)

    productService
      .findById(productId.`val`)
    match {
      case Some(product) => newState.send(C, Ok, product)
      case _ => newState.send(C, NotFound)
    }
  }

  private def handleCreate(state: ProductSession_P_1_Cases): ProductSession_P_1 = {
    val receivedProduct = new Buf[ProductDTO]()
    val newState = state.receive(Create, receivedProduct)

    productService
      .create(receivedProduct.`val`)
    match {
      case Left(error) => newState.send(C, Err, error)
      case Right(product) => newState.send(C, Ok, product)
    }
  }

  private def handleUpdate(state: ProductSession_P_1_Cases): ProductSession_P_1 = {
    val productId = new Buf[java.lang.Long]()
    val receivedProduct = new Buf[ProductDTO]()
    val newState = state.receive(Update, productId, receivedProduct)

    productService
      .update(productId.`val`, receivedProduct.`val`)
    match {
      case None => newState.send(C, NotFound)
      case Some(Left(error)) => newState.send(C, Err, error)
      case Some(Right(product)) => newState.send(C, Ok, product)
    }
  }

  private def handleReplace(state: ProductSession_P_1_Cases): ProductSession_P_1 = {
    val productId = new Buf[java.lang.Long]()
    val receivedProduct = new Buf[ProductDTO]()
    val newState = state.receive(Replace, productId, receivedProduct)

    val id = productId.`val`
    val newProduct = receivedProduct.`val`

    val isCreated = productService
      .findById(id)
      .isEmpty

    productService.replace(id, newProduct)
    match {
      case Left(error) => newState.send(C, Err, error)
      case Right(product) =>
        if (isCreated)
          newState.send(C, Created, product)
        else
          newState.send(C, Ok, product)
    }
  }


  private def handleDelete(state: ProductSession_P_1_Cases): ProductSession_P_1 = {
    val productId = new Buf[java.lang.Long]()
    val newState = state.receive(Delete, productId)

    if (productService.deleteById(productId.`val`)) {
      newState.send(C, Ok)
    } else {
      newState.send(C, NotFound)
    }
  }


  private def handleBye(state: ProductSession_P_1_Cases): Unit = {
    state
      .receive(Bye)
  }
}
