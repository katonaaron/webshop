package com.fullcart.webshop.controller

import org.springframework.hateoas.RepresentationModel
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.{linkTo, methodOn}
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class RootController {

  @GetMapping(Array("/"))
  def root() : ResponseEntity[RepresentationModel[Nothing]] = {
    val model = new RepresentationModel()
    model.add(linkTo(methodOn(classOf[RootController]).root()).withSelfRel())
    model.add(linkTo(methodOn(classOf[UserController]).findAll()).withRel("users"))
    model.add(linkTo(methodOn(classOf[OrderController]).findAll()).withRel("orders"))
    model.add(linkTo(methodOn(classOf[ProductController]).findAll()).withRel("products"))
    ResponseEntity.ok(model)
  }
}
