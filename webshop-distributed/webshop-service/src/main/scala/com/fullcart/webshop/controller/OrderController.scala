package com.fullcart.webshop.controller

import com.fullcart.dto.OrderDTO
import com.fullcart.webshop.assembler.OrderDTOAssembler
import com.fullcart.webshop.service.BuyingService
import com.fullcart.webshop.util.HttpResponseUtil
import org.springframework.hateoas._
import org.springframework.hateoas.mediatype.problem.Problem
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation._


@RestController
class OrderController(private val buyingService: BuyingService, private val assembler: OrderDTOAssembler) {

  @GetMapping(Array("/orders"))
  def findAll(): ResponseEntity[CollectionModel[EntityModel[OrderDTO]]] =
    ResponseEntity.ok(assembler.toCollectionModel(buyingService.findAll()))

  @PostMapping(Array("/orders"))
  def create(@RequestBody order: OrderDTO): ResponseEntity[_ >: Problem with EntityModel[OrderDTO] <: Object] =
    buyingService.create(order) match {
      case (status, Left(error)) => HttpResponseUtil.problem(status, error)
      case (status, Right(order)) => HttpResponseUtil.withBody(status, assembler.toModel(order))
    }

  @GetMapping(Array("/orders/{id}"))
  def findOne(@PathVariable id: Long): ResponseEntity[EntityModel[OrderDTO]] =
    buyingService.findOne(id) match {
      case (status, None) => HttpResponseUtil.noBody(status)
      case (status, Some(order)) => HttpResponseUtil.withBody(status, assembler.toModel(order))
    }

  @DeleteMapping(Array("/orders/{id}/cancel"))
  def cancel(@PathVariable id: Long): ResponseEntity[_ <: EntityModel[OrderDTO]] =
    buyingService.cancel(id) match {
      case (status, None) => HttpResponseUtil.noBody(status)
      case (status, Some(order)) => HttpResponseUtil.withBody(status, assembler.toModel(order))
    }

  @PutMapping(Array("/orders/{id}/complete"))
  def complete(@PathVariable id: Long): ResponseEntity[_ <: EntityModel[OrderDTO]] =
    buyingService.complete(id) match {
      case (status, None) => HttpResponseUtil.noBody(status)
      case (status, Some(order)) => HttpResponseUtil.withBody(status, assembler.toModel(order))
    }

  //  @GetMapping(Array("/users/{id}/orders"))
  //  def findOrders(@PathVariable id: Long): ResponseEntity[CollectionModel[EntityModel[Order]]] = {
  //    val collectionModel = assembler.toCollectionModel(repository.findByUserId(id))
  //
  //    val newLinks = collectionModel.getLinks.merge(Links.MergeMode.REPLACE_BY_REL,
  //      linkTo(methodOn(classOf[OrderController]).findOrders(id)).withSelfRel()
  //    )
  //
  //    ResponseEntity.ok(CollectionModel.of(collectionModel.getContent, newLinks))
  //  }
}
