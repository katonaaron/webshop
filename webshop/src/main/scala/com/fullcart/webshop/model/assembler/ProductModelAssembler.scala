package com.fullcart.webshop.model.assembler

import com.fullcart.webshop.controller.ProductController
import org.graalvm.compiler.lir.CompositeValue.Component
import org.springframework.hateoas.EntityModel
import org.springframework.hateoas.server.RepresentationModelAssembler
import com.fullcart.webshop.model.Product
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.{linkTo, methodOn}


@Component
class ProductModelAssembler extends  RepresentationModelAssembler[Product, EntityModel[Product]]{
  override def toModel(product: Product): EntityModel[Product] =
    EntityModel.of(product,
      linkTo(methodOn(classOf[ProductController]).one(product.id)).withSelfRel(),
      linkTo(methodOn(classOf[ProductController]).all()).withRel("products"))
}
