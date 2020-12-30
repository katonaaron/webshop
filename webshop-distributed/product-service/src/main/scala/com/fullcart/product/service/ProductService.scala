package com.fullcart.product.service

import com.fullcart.dto.ProductDTO
import com.fullcart.product.model.Product
import com.fullcart.product.repository.ProductRepository
import org.springframework.stereotype.Component

import java.util
import scala.jdk.CollectionConverters.{ListHasAsScala, SeqHasAsJava}
import scala.jdk.OptionConverters._

@Component
class ProductService(private val productRepository: ProductRepository) {

  def findById(id: Long): Option[ProductDTO] = productRepository
    .findById(id)
    .toScala
    .map(Product.toDto)

  def findAll(): util.List[ProductDTO] = productRepository
    .findAll()
    .asScala
    .map(Product.toDto)
    .asJava

  def create(dto: ProductDTO): Either[String, ProductDTO] = {
    (for {
      product <- Product.fromDto(dto)
      // TODO: Further validation
    } yield product)
    match {
      case Left(error) => Left(error)
      case Right(product) =>
        Right(Product.toDto(productRepository.save(product)))
    }
  }

  def update(id: Long, dto: ProductDTO): Option[Either[String, ProductDTO]] = {
    productRepository
      .findById(id)
      .toScala
      .map { oldProduct =>
        (for {
          product <- Right(Product.update(oldProduct, dto))
          // TODO: Further validation
        } yield product)
          .map(productRepository.save)
          .map(Product.toDto)
      }
  }

  def replace(id: Long, dto: ProductDTO): Either[String, ProductDTO] = {
    (for {
      product <- Product.fromDto(id, dto)
      // TODO: Further validation
    } yield product)
      .map(productRepository.save)
      .map(Product.toDto)
  }

  def deleteById(id: Long): Boolean =
    if (productRepository.existsById(id)) {
      productRepository.deleteById(id)
      true
    } else {
      false
    }
}
