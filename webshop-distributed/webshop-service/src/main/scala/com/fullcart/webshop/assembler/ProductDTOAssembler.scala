package com.fullcart.webshop.assembler

import com.fullcart.dto.ProductDTO
import com.fullcart.webshop.controller.{OrderController, ProductController, RootController, UserController}
import org.springframework.hateoas.server.SimpleRepresentationModelAssembler
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.{linkTo, methodOn}
import org.springframework.hateoas.{CollectionModel, EntityModel}
import org.springframework.stereotype.Component


@Component
class ProductDTOAssembler extends SimpleRepresentationModelAssembler[ProductDTO] {

  override def addLinks(resource: EntityModel[ProductDTO]): Unit = {
    val product = resource.getContent
    val id = product.id.get

    resource.add(linkTo(methodOn(classOf[ProductController]).findOne(id)).withSelfRel())
    resource.add(linkTo(methodOn(classOf[ProductController]).findAll()).withRel("products"))
  }

  override def addLinks(resources: CollectionModel[EntityModel[ProductDTO]]): Unit = {
    resources.add(linkTo(methodOn(classOf[ProductController]).findAll()).withSelfRel())

    resources.add(linkTo(methodOn(classOf[UserController]).findAll()).withRel("users"))
    resources.add(linkTo(methodOn(classOf[OrderController]).findAll()).withRel("orders"))
    resources.add(linkTo(methodOn(classOf[RootController]).root()).withRel("root"))
  }
}
