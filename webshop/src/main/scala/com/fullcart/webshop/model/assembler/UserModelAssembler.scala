package com.fullcart.webshop.model.assembler

import com.fullcart.webshop.controller.UserController
import com.fullcart.webshop.model.User
import org.springframework.hateoas.EntityModel
import org.springframework.hateoas.server.RepresentationModelAssembler
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.{linkTo, methodOn}
import org.springframework.stereotype.Component

@Component
class UserModelAssembler extends RepresentationModelAssembler[User, EntityModel[User]] {

  override def toModel(user: User): EntityModel[User] =
    EntityModel.of(user,
      linkTo(methodOn(classOf[UserController]).one(user.id)).withSelfRel(),
      linkTo(methodOn(classOf[UserController]).all()).withRel("users")
    )
}
