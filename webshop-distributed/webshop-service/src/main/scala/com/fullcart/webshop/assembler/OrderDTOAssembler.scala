package com.fullcart.webshop.assembler

import com.fullcart.common.model.OrderStatus
import com.fullcart.dto.OrderDTO
import com.fullcart.webshop.controller.{OrderController, ProductController, RootController, UserController}
import org.springframework.hateoas.server.SimpleRepresentationModelAssembler
import org.springframework.hateoas.server.core.Relation
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.{linkTo, methodOn}
import org.springframework.hateoas.{CollectionModel, EntityModel}
import org.springframework.stereotype.Component


@Component
class OrderDTOAssembler extends SimpleRepresentationModelAssembler[OrderDTO] {

  private val collectionName = classOf[OrderDTO].getAnnotation(classOf[Relation]).collectionRelation()

  override def addLinks(resource: EntityModel[OrderDTO]): Unit = {
    val order = resource.getContent
    val id = order.id.get

    resource.add(linkTo(methodOn(classOf[ProductController]).findOne(id)).withSelfRel())
    resource.add(linkTo(methodOn(classOf[ProductController]).findAll()).withRel(collectionName))

    //    if (order.products != null && !order.products.isEmpty) {
    //      resource.add(linkTo(methodOn(classOf[ProductController]).findProducts(order.id)).withRel("products"))
    //    }

    if (order.status.contains(OrderStatus.IN_PROGRESS)) {
      resource.add(linkTo(methodOn(classOf[OrderController]).cancel(id)).withRel("cancel"))
      resource.add(linkTo(methodOn(classOf[OrderController]).complete(id)).withRel("complete"))
    }
  }

  override def addLinks(resources: CollectionModel[EntityModel[OrderDTO]]): Unit = {
    resources.add(linkTo(methodOn(classOf[ProductController]).findAll()).withSelfRel())

    resources.add(linkTo(methodOn(classOf[UserController]).findAll()).withRel("users"))
    resources.add(linkTo(methodOn(classOf[ProductController]).findAll()).withRel("products"))
    resources.add(linkTo(methodOn(classOf[RootController]).root()).withRel("root"))
  }
}
