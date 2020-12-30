package com.fullcart.product.model

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

  override def toString = s"Product($id, $price, $name, $description)"
}
