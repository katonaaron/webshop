package com.fullcart.product.model

import com.fullcart.dto.ProductDTO

import javax.persistence.{Entity, GeneratedValue, Id}
import javax.validation.constraints.{NotBlank, NotNull}
import scala.beans.BeanProperty

@Entity
class Product {

  @Id
  @GeneratedValue
  @BeanProperty
  var id: Long = _

  @NotNull(message = "Price is mandatory")
  @BeanProperty
  var price: Double = _

  @NotBlank(message = "Name is mandatory")
  @BeanProperty
  var name: String = _

  @BeanProperty
  var description: String = _

  def this(id: Long, price: Double, name: String, description: String) = {
    this
    this.id = id
    this.price = price
    this.name = name
    this.description = description
  }
}

object Product {
  def fromDto(dto: ProductDTO): Product = {
    new Product(dto.id, dto.price, dto.name, dto.description)
  }

  def toDto(product: Product): ProductDTO = {
    new ProductDTO(product.id, product.price, product.name, product.description)
  }
}
