package com.fullcart.product.model

import com.fullcart.dto.ProductDTO

import javax.persistence.{Entity, GeneratedValue, Id}
import javax.validation.constraints.{NotBlank, NotNull}

@Entity
class Product {

  @Id
  @GeneratedValue
  var id: Long = _

  @NotNull(message = "Price is mandatory")
  var price: Double = _

  @NotBlank(message = "Name is mandatory")
  var name: String = _

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

  def fromDto(dto: ProductDTO): Either[String, Product] = {
    fromDto(dto.id.getOrElse(0L), dto)
  }

  def fromDto(id: Long, dto: ProductDTO): Either[String, Product] = {
    for {
      price <- dto.price.map(Right(_)).getOrElse(Left("Missing price"))
      name <- dto.name.map(Right(_)).getOrElse(Left("Missing name"))
      description <- dto.description.map(Right(_)).getOrElse(Left("Missing description"))
    } yield new Product(id, price, name, description)
  }

  def toDto(product: Product): ProductDTO = {
    new ProductDTO(Some(product.id), Some(product.price), Some(product.name), Some(product.description))
  }

  def update(oldProduct: Product, newProduct: ProductDTO): Product = {
    val id = oldProduct.id
    val price = newProduct.price.getOrElse(oldProduct.price)
    val name = newProduct.name.getOrElse(oldProduct.name)
    val description = newProduct.description.getOrElse(oldProduct.description)
    new Product(id, price, name, description)
  }
}
