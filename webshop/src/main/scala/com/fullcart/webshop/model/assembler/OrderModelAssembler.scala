package com.fullcart.webshop.model.assembler


import com.fullcart.webshop.controller.{OrderController, ProductController, RootController, UserController}
import org.springframework.hateoas.{CollectionModel, EntityModel, SimpleIdentifiableRepresentationModelAssembler}
import org.springframework.hateoas.server.RepresentationModelAssembler
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.{linkTo, methodOn}
import com.fullcart.webshop.model.{Order, User}
import org.springframework.stereotype.Component

@Component
class OrderModelAssembler extends SimpleIdentifiableRepresentationModelAssembler[Order](classOf[OrderController]) {

  override def addLinks(resource: EntityModel[Order]): Unit = {
    super.addLinks(resource)

    resource.add(linkTo(methodOn(classOf[UserController]).findUser(resource.getContent.id)).withRel("user"))
  }

  override def addLinks(resources: CollectionModel[EntityModel[Order]]): Unit = {
    super.addLinks(resources)

    resources.add(linkTo(methodOn(classOf[UserController]).findAll()).withRel("users"))
    resources.add(linkTo(methodOn(classOf[ProductController]).findAll()).withRel("products"))
    resources.add(linkTo(methodOn(classOf[RootController]).root()).withRel("root"))
  }
}
