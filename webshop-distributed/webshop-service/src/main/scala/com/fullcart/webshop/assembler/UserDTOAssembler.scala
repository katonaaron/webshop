package com.fullcart.webshop.assembler

import com.fullcart.dto.UserDTO
import com.fullcart.webshop.controller.{OrderController, ProductController, RootController}
import org.springframework.hateoas.server.SimpleRepresentationModelAssembler
import org.springframework.hateoas.server.core.Relation
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.{linkTo, methodOn}
import org.springframework.hateoas.{CollectionModel, EntityModel}
import org.springframework.stereotype.Component


@Component
class UserDTOAssembler extends SimpleRepresentationModelAssembler[UserDTO] {

  private val collectionName = classOf[UserDTO].getAnnotation(classOf[Relation]).collectionRelation()

  override def addLinks(resource: EntityModel[UserDTO]): Unit = {
    val user = resource.getContent
    val id = user.id.get

    resource.add(linkTo(methodOn(classOf[ProductController]).findOne(id)).withSelfRel())
    resource.add(linkTo(methodOn(classOf[ProductController]).findAll()).withRel(collectionName))

    //    if (!user.orders.isEmpty) {
    //      resource.add(linkTo(methodOn(classOf[OrderController]).findOrders(user.id)).withRel("orders"))
    //    }
  }

  override def addLinks(resources: CollectionModel[EntityModel[UserDTO]]): Unit = {
    resources.add(linkTo(methodOn(classOf[ProductController]).findAll()).withSelfRel())

    resources.add(linkTo(methodOn(classOf[OrderController]).findAll()).withRel("orders"))
    resources.add(linkTo(methodOn(classOf[ProductController]).findAll()).withRel("products"))
    resources.add(linkTo(methodOn(classOf[RootController]).root()).withRel("root"))
  }
}
