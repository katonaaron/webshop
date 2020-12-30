package com.fullcart.webshop.controller

import com.fullcart.dto.UserDTO
import com.fullcart.webshop.assembler.UserDTOAssembler
import com.fullcart.webshop.service.UserService
import com.fullcart.webshop.util.HttpResponseUtil
import org.springframework.hateoas.mediatype.problem.Problem
import org.springframework.hateoas.{CollectionModel, EntityModel}
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation._

@RestController
class UserController(private val userService: UserService, private val assembler: UserDTOAssembler) {

  @GetMapping(Array("/users"))
  def findAll(): ResponseEntity[CollectionModel[EntityModel[UserDTO]]] =
    ResponseEntity.ok(assembler.toCollectionModel(userService.findAll()))

  @PostMapping(Array("/users"))
  def create(@RequestBody user: UserDTO): ResponseEntity[_ >: Problem with EntityModel[UserDTO] <: Object] = {
    userService.create(user) match {
      case (status, Left(error)) => HttpResponseUtil.problem(status, error)
      case (status, Right(user)) => HttpResponseUtil.withBody(status, assembler.toModel(user))
    }
  }

  @GetMapping(Array("/users/{id}"))
  def findOne(@PathVariable id: Long): ResponseEntity[EntityModel[UserDTO]] =
    userService.findOne(id) match {
      case (status, None) => HttpResponseUtil.noBody(status)
      case (status, Some(user)) => HttpResponseUtil.withBody(status, assembler.toModel(user))
    }

  @PutMapping(Array("/users/{id}"))
  def replace(@PathVariable id: Long, @RequestBody newUser: UserDTO): ResponseEntity[_ <: Object] = {
    userService.replace(id, newUser) match {
      case (status, Left(error)) => HttpResponseUtil.problem(status, error)
      case (status, Right(user)) => HttpResponseUtil.withBody(status, assembler.toModel(user))
    }
  }

  @PatchMapping(Array("/users/{id}"))
  def update(@PathVariable id: Long, @RequestBody newUser: UserDTO): ResponseEntity[_ <: Object] = {
    userService.update(id, newUser) match {
      case (status, None) => HttpResponseUtil.noBody(status)
      case (status, Some(Left(error))) => HttpResponseUtil.problem(status, error)
      case (status, Some(Right(user))) => HttpResponseUtil.withBody(status, assembler.toModel(user))
    }
  }

  @DeleteMapping(Array("/users/{id}"))
  def delete(@PathVariable id: Long): ResponseEntity[Nothing] =
    HttpResponseUtil.noBody(userService.delete(id))


  //  @GetMapping(Array("/orders/{id}/user"))
  //  def findUser(@PathVariable id: Long): ResponseEntity[EntityModel[User]] =
  //    ResponseEntity.ok(assembler.toModel(repository.findByOrdersId(id)))
}
