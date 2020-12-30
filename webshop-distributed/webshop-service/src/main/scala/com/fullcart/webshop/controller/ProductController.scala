package com.fullcart.webshop.controller

import com.fullcart.dto.ProductDTO
import com.fullcart.webshop.assembler.ProductDTOAssembler
import com.fullcart.webshop.service.ProductService
import com.fullcart.webshop.util.HttpResponseUtil
import org.springframework.hateoas.mediatype.problem.Problem
import org.springframework.hateoas.{CollectionModel, EntityModel}
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation._

@RestController
class ProductController(private val productService: ProductService, private val assembler: ProductDTOAssembler) {

  @GetMapping(Array("/products"))
  def findAll(): ResponseEntity[CollectionModel[EntityModel[ProductDTO]]] =
    ResponseEntity.ok(assembler.toCollectionModel(productService.findAll()))

  @PostMapping(Array("/products"))
  def create(@RequestBody product: ProductDTO): ResponseEntity[_ >: Problem with EntityModel[ProductDTO] <: Object] = {
    productService.create(product) match {
      case (status, Left(error)) => HttpResponseUtil.problem(status, error)
      case (status, Right(product)) => HttpResponseUtil.withBody(status, assembler.toModel(product))
    }
  }

  @GetMapping(Array("/products/{id}"))
  def findOne(@PathVariable id: Long): ResponseEntity[EntityModel[ProductDTO]] =
    productService.findOne(id) match {
      case (status, None) => HttpResponseUtil.noBody(status)
      case (status, Some(product)) => HttpResponseUtil.withBody(status, assembler.toModel(product))
    }

  @PutMapping(Array("/products/{id}"))
  def replace(@PathVariable id: Long, @RequestBody newProduct: ProductDTO): ResponseEntity[_ <: Object] = {
    productService.replace(id, newProduct) match {
      case (status, Left(error)) => HttpResponseUtil.problem(status, error)
      case (status, Right(product)) => HttpResponseUtil.withBody(status, assembler.toModel(product))
    }
  }

  @PatchMapping(Array("/products/{id}"))
  def update(@PathVariable id: Long, @RequestBody newProduct: ProductDTO): ResponseEntity[_ <: Object] = {
    productService.update(id, newProduct) match {
      case (status, None) => HttpResponseUtil.noBody(status)
      case (status, Some(Left(error))) => HttpResponseUtil.problem(status, error)
      case (status, Some(Right(product))) => HttpResponseUtil.withBody(status, assembler.toModel(product))
    }
  }

  @DeleteMapping(Array("/products/{id}"))
  def delete(@PathVariable id: Long): ResponseEntity[Nothing] =
    HttpResponseUtil.noBody(productService.delete(id))

  //
  //  @GetMapping(Array("/orders/{id}/products"))
  //  def findProducts(@PathVariable id: Long): ResponseEntity[CollectionModel[EntityModel[Product]]] = {
  //    val collectionModel = assembler.toCollectionModel(repository.findByOrdersId(id))
  //
  //    val newLinks = collectionModel.getLinks.merge(Links.MergeMode.REPLACE_BY_REL,
  //      linkTo(methodOn(classOf[ProductController]).findProducts(id)).withSelfRel()
  //    )
  //
  //    ResponseEntity.ok(CollectionModel.of(collectionModel.getContent, newLinks))
  //  }

}
