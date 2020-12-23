package com.fullcart.webshop.controller

import com.fullcart.webshop.model.User
import com.fullcart.webshop.model.assembler.UserModelAssembler
import com.fullcart.webshop.repository.UserRepository
import org.springframework.hateoas.{CollectionModel, EntityModel, IanaLinkRelations}
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation._

import javax.validation.Valid

@RestController
class UserController(private val repository: UserRepository, private val assembler: UserModelAssembler) {

  // Aggregate root

  @GetMapping(Array("/users"))
  def findAll(): ResponseEntity[CollectionModel[EntityModel[User]]] =
    ResponseEntity.ok(assembler.toCollectionModel(repository.findAll()))

  @PostMapping(Array("/users"))
  def newUser(@Valid @RequestBody user: User): ResponseEntity[EntityModel[User]] = {
    val entityModel = assembler.toModel(repository.save(user))

    ResponseEntity
      .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri)
      .body(entityModel)
  }

  // Single item

  @GetMapping(Array("/users/{id}"))
  def findOne(@PathVariable id: Long): ResponseEntity[EntityModel[User]] =
    repository.findById(id)
      .map(assembler.toModel _)
      .map(ResponseEntity.ok(_))
      .orElse(ResponseEntity.notFound().build())


  @PutMapping(Array("/users/{id}"))
  def replaceUser(@Valid @RequestBody newUser: User, @PathVariable id: Long): ResponseEntity[EntityModel[User]] = {
    val updatedUser = repository.findById(id)
      .map { user =>
        user.firstName = newUser.firstName
        user.lastName = newUser.lastName
        user.email = newUser.email
        repository.save(user)
      }
      .orElseGet { () =>
        newUser.id = id
        repository.save(newUser)
      }

    val entityModel = assembler.toModel(updatedUser)
    ResponseEntity
      .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri)
      .body(entityModel)
  }

  @DeleteMapping(Array("/users/{id}"))
  def deleteUser(@PathVariable id: Long): ResponseEntity[Nothing] = {
    repository.deleteById(id)
    ResponseEntity.noContent().build()
  }


  @GetMapping(Array("/orders/{id}/user"))
  def findUser(@PathVariable id: Long): ResponseEntity[EntityModel[User]] =
    ResponseEntity.ok(assembler.toModel(repository.findByOrdersId(id)))
}
