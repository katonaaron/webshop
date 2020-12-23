package com.fullcart.webshop.controller

import com.fullcart.webshop.dto.OrderDTO
import com.fullcart.webshop.model.assembler.OrderModelAssembler
import com.fullcart.webshop.model.{Order, OrderStatus}
import com.fullcart.webshop.repository.OrderRepository
import com.fullcart.webshop.transformer.OrderDTOTransformer
import org.springframework.hateoas._
import org.springframework.hateoas.mediatype.problem.Problem
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.{linkTo, methodOn}
import org.springframework.http.{HttpHeaders, HttpStatus, ResponseEntity}
import org.springframework.web.bind.annotation._

import javax.validation.Valid


@RestController
class OrderController(private val repository: OrderRepository, private val assembler: OrderModelAssembler, private val transformer: OrderDTOTransformer) {

  @GetMapping(Array("/orders"))
  def findAll(): ResponseEntity[CollectionModel[EntityModel[Order]]] =
    ResponseEntity.ok(assembler.toCollectionModel(repository.findAll()))

  @PostMapping(Array("/orders"))
  def newOrder(@Valid @RequestBody orderDTO: EntityModel[OrderDTO]): ResponseEntity[_ <: EntityModel[Order]] =
    transformer.transform(orderDTO.getContent)
    match {
      case Some(order) =>
        val entityModel = assembler.toModel(repository.save(order))

        ResponseEntity
          .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri)
          .body(entityModel)
      case None =>
        ResponseEntity.badRequest().build()
    }

  @GetMapping(Array("/orders/{id}"))
  def findOne(@PathVariable id: Long): ResponseEntity[EntityModel[Order]] =
    repository.findById(id)
      .map(assembler.toModel _)
      .map(ResponseEntity.ok(_))
      .orElse(ResponseEntity.notFound().build())

  @GetMapping(Array("/users/{id}/orders"))
  def findOrders(@PathVariable id: Long): ResponseEntity[CollectionModel[EntityModel[Order]]] = {
    val collectionModel = assembler.toCollectionModel(repository.findByUserId(id))

    val newLinks = collectionModel.getLinks.merge(Links.MergeMode.REPLACE_BY_REL,
      linkTo(methodOn(classOf[OrderController]).findOrders(id)).withSelfRel()
    )

    ResponseEntity.ok(CollectionModel.of(collectionModel.getContent, newLinks))
  }

  @DeleteMapping(Array("/orders/{id}/cancel"))
  def cancel(@PathVariable id: Long): ResponseEntity[_ >: EntityModel[Order] with Problem <: Object] = {
    repository.findById(id)
      .map { order =>
        if (order.status eq OrderStatus.IN_PROGRESS) {
          order.status = OrderStatus.CANCELLED
          ResponseEntity.ok(assembler.toModel(repository.save(order)))
        } else {
          ResponseEntity
            .status(HttpStatus.METHOD_NOT_ALLOWED)
            .header(HttpHeaders.CONTENT_TYPE, MediaTypes.HTTP_PROBLEM_DETAILS_JSON_VALUE)
            .body(Problem.create
              .withTitle("Method not allowed")
              .withDetail("You can't cancel an order that is in the " + order.status + " status"))
        }
      }
      .orElse(ResponseEntity.notFound().build())
  }

  @PutMapping(Array("/orders/{id}/complete"))
  def complete(@PathVariable id: Long) = {
    repository.findById(id)
      .map { order =>
        if (order.status eq OrderStatus.IN_PROGRESS) {
          order.status = OrderStatus.COMPLETED
          ResponseEntity.ok(assembler.toModel(repository.save(order)))
        } else {
          ResponseEntity
            .status(HttpStatus.METHOD_NOT_ALLOWED)
            .header(HttpHeaders.CONTENT_TYPE, MediaTypes.HTTP_PROBLEM_DETAILS_JSON_VALUE)
            .body(Problem.create
              .withTitle("Method not allowed")
              .withDetail("You can't cancel an order that is in the " + order.status + " status"))
        }
      }
      .orElse(ResponseEntity.notFound().build())
  }
}
