package com.fullcart.webshop.controller

import java.util.stream.Collectors

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
      .orElseThrow(() => new OrderNotFoundException(id))

    assembler.toModel(order)
  }

  @PutMapping(Array("/orders/{id}"))
  def replaceOrder(@Valid @RequestBody newOrder: Order, @PathVariable id: Long): ResponseEntity[EntityModel[Order]]={
    val updatedOrder = repository.findById(id)
      .map{order =>
        order.date = newOrder.date
        order.price = newOrder.price
        repository.save(order)
      }

      .orElseGet{() =>
        newOrder.id =id
        repository.save(newOrder)
      }

    val entityModel = assembler.toModel(updatedOrder)
    ResponseEntity
      .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri)
      .body(entityModel)

  }

  @DeleteMapping(Array("/orders/{id}"))
  def deleteOrder(@PathVariable id : Long): Unit = {
    repository.deleteById(id)
    ResponseEntity.noContent().build()
  }

}
