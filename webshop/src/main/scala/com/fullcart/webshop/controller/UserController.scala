package com.fullcart.webshop.controller

import java.util.stream.Collectors

import com.fullcart.webshop.exception.UserNotFoundException
import com.fullcart.webshop.model.User
import com.fullcart.webshop.model.assembler.UserModelAssembler
import com.fullcart.webshop.repository.UserRepository
import javax.validation.Valid
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.{linkTo, methodOn}
import org.springframework.hateoas.{CollectionModel, EntityModel, IanaLinkRelations}
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation._

@RestController
class UserController(private val repository: UserRepository, private val assembler: UserModelAssembler) {

  // Aggregate root

  @GetMapping(Array("/users"))
  def all(): CollectionModel[EntityModel[User]] = {
    val users = repository.findAll().stream()
      .map(user => assembler.toModel(user))
      .collect(Collectors.toList())

    CollectionModel.of(users,
      linkTo(methodOn(classOf[UserController]).all()).withSelfRel()
    )
  }

  @PostMapping(Array("/users"))
  def newUser(@Valid @RequestBody user: User): ResponseEntity[EntityModel[User]] = {
    val entityModel = assembler.toModel(repository.save(user))

    ResponseEntity
      .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri)
      .body(entityModel)
  }

  // Single item

  @GetMapping(Array("/users/{id}"))
  def one(@PathVariable id: Long): EntityModel[User] = {
    val user = repository.findById(id)
      .orElseThrow(() => new UserNotFoundException(id))

    assembler.toModel(user)
  }

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
  def deleteUser(@PathVariable id: Long): Unit = {
    repository.deleteById(id)
    ResponseEntity.noContent().build()
  }
}
