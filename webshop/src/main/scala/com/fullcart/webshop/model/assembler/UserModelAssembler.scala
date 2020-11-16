package com.fullcart.webshop.model.assembler

import com.fullcart.webshop.controller.{OrderController, ProductController, RootController, UserController}
import com.fullcart.webshop.model.User
import org.springframework.hateoas.{CollectionModel, EntityModel, SimpleIdentifiableRepresentationModelAssembler}
import org.springframework.hateoas.server.RepresentationModelAssembler
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.{linkTo, methodOn}
import org.springframework.stereotype.Component

@Component
class UserModelAssembler extends SimpleIdentifiableRepresentationModelAssembler[User](classOf[UserController]) {

  override def addLinks(resource: EntityModel[User]): Unit = {
    super.addLinks(resource)

    val user = resource.getContent

    if (!user.orders.isEmpty) {
      resource.add(linkTo(methodOn(classOf[OrderController]).findOrders(user.id)).withRel("orders"))
    }
  }

  override def addLinks(resources: CollectionModel[EntityModel[User]]): Unit = {
    super.addLinks(resources)

    resources.add(linkTo(methodOn(classOf[OrderController]).findAll()).withRel("orders"))
    resources.add(linkTo(methodOn(classOf[ProductController]).findAll()).withRel("products"))
    resources.add(linkTo(methodOn(classOf[RootController]).root()).withRel("root"))
  }
}
