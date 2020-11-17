package com.fullcart.webshop.model.assembler

import com.fullcart.webshop.controller.{OrderController, ProductController, RootController, UserController}
import com.fullcart.webshop.model.Order
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.{linkTo, methodOn}
import org.springframework.hateoas.{CollectionModel, EntityModel, SimpleIdentifiableRepresentationModelAssembler}
import org.springframework.stereotype.Component

@Component
class OrderModelAssembler extends SimpleIdentifiableRepresentationModelAssembler[Order](classOf[OrderController]) {

  override def addLinks(resource: EntityModel[Order]): Unit = {
    super.addLinks(resource)

    val order = resource.getContent

    resource.add(linkTo(methodOn(classOf[UserController]).findUser(order.id)).withRel("user"))

    if (order.products != null && !order.products.isEmpty) {
      resource.add(linkTo(methodOn(classOf[ProductController]).findProducts(order.id)).withRel("products"))
    }
  }

  override def addLinks(resources: CollectionModel[EntityModel[Order]]): Unit = {
    super.addLinks(resources)

    resources.add(linkTo(methodOn(classOf[UserController]).findAll()).withRel("users"))
    resources.add(linkTo(methodOn(classOf[ProductController]).findAll()).withRel("products"))
    resources.add(linkTo(methodOn(classOf[RootController]).root()).withRel("root"))
  }
}
