package com.fullcart.webshop.controller

import com.fullcart.webshop.dto.OrderDTO
import com.fullcart.webshop.model.Order
import com.fullcart.webshop.model.assembler.OrderModelAssembler
import com.fullcart.webshop.repository.OrderRepository
import com.fullcart.webshop.transformer.OrderDTOTransformer
import javax.validation.Valid
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.{linkTo, methodOn}
import org.springframework.hateoas.{CollectionModel, EntityModel, IanaLinkRelations, Links}
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation._


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

}
