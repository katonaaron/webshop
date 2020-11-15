package com.fullcart.webshop.model.assembler


import com.fullcart.webshop.controller.OrderController
import org.springframework.hateoas.EntityModel
import org.springframework.hateoas.server.RepresentationModelAssembler
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.{linkTo, methodOn}
import com.fullcart.webshop.model.Order
import org.graalvm.compiler.lir.CompositeValue.Component

@Component
class OrderModelAssembler extends RepresentationModelAssembler[Order, EntityModel[Order]]{
  override def toModel(order: Order): EntityModel[Order] =
    EntityModel.of(order,
      linkTo(methodOn(classOf[OrderController]).one(order.id)).withSelfRel(),
      linkTo(methodOn(classOf[OrderController]).all()).withRel("orders"))
}
