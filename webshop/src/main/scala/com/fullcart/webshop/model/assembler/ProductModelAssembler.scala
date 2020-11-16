package com.fullcart.webshop.model.assembler

import com.fullcart.webshop.controller.{OrderController, ProductController, RootController, UserController}
import org.springframework.hateoas.{CollectionModel, EntityModel, SimpleIdentifiableRepresentationModelAssembler}
import org.springframework.hateoas.server.RepresentationModelAssembler
import com.fullcart.webshop.model.{Order, Product, User}
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.{linkTo, methodOn}
import org.springframework.stereotype.Component


@Component
class ProductModelAssembler extends SimpleIdentifiableRepresentationModelAssembler[Product](classOf[ProductController]) {

  override def addLinks(resource: EntityModel[Product]): Unit = super.addLinks(resource)

  override def addLinks(resources: CollectionModel[EntityModel[Product]]): Unit = {
    super.addLinks(resources)

    resources.add(linkTo(methodOn(classOf[UserController]).findAll()).withRel("users"))
    resources.add(linkTo(methodOn(classOf[OrderController]).findAll()).withRel("orders"))
    resources.add(linkTo(methodOn(classOf[RootController]).root()).withRel("root"))
  }
}
