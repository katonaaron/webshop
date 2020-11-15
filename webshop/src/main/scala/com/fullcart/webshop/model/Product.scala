package com.fullcart.webshop.model

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
  var price: Double =_

  @NotBlank(message = "Name is mandatory")
  @BeanProperty
  var name: String =_

  @BeanProperty
  var description: String=_

}
