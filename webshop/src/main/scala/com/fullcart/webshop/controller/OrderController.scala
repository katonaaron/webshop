package com.fullcart.webshop.controller

import java.util.stream.Collectors

import com.fullcart.webshop.exception.EntityNotFoundException
import com.fullcart.webshop.model.assembler.OrderModelAssembler
import com.fullcart.webshop.repository.OrderRepository
import org.springframework.hateoas.{CollectionModel, EntityModel, IanaLinkRelations}
import org.springframework.web.bind.annotation.{DeleteMapping, GetMapping, PathVariable, PostMapping, PutMapping, RequestBody, RestController}
import com.fullcart.webshop.model.Order
import javax.validation.Valid
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.{linkTo, methodOn}
import org.springframework.http.ResponseEntity


@RestController
class OrderController(private val repository: OrderRepository, private val assembler: OrderModelAssembler) {

  @GetMapping(Array("/orders"))
  def all(): CollectionModel[EntityModel[Order]]={
    val orders = repository.findAll().stream()
      .map(order => assembler.toModel(order))
      .collect(Collectors.toList())

    CollectionModel.of(orders,
      linkTo(methodOn(classOf[OrderController]).all()).withSelfRel()
    )
  }

  @PostMapping(Array("/orders"))
  def newOrder(@Valid @RequestBody order: Order): ResponseEntity[EntityModel[Order]]={
    val entityModel = assembler.toModel(repository.save(order))

    ResponseEntity
      .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri)
      .body(entityModel)
  }

  @GetMapping(Array("/orders/{id}"))
  def one(@PathVariable id: Long): EntityModel[Order]={
    val order = repository.findById(id)
      .orElseThrow(() => new EntityNotFoundException(id))

    assembler.toModel(order)
  }

  @DeleteMapping(Array("/orders/{id}"))
  def deleteOrder(@PathVariable id : Long): ResponseEntity[Nothing] = {
    repository.deleteById(id)
    ResponseEntity.noContent().build()
  }

}
