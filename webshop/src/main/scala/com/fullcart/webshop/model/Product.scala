package com.fullcart.webshop.model

import java.beans.BeanProperty

import javax.persistence.{Entity, GeneratedValue, Id}
import javax.validation.constraints.NotBlank

import scala.beans.BeanProperty

@Entity
class Product {

  @Id
  @GeneratedValue
  @BeanProperty
  var id: Long = _

  @BeanProperty
  var price: Long =_

  @NotBlank
  @BeanProperty
  var name: String =_

  @BeanProperty
  var description: String=_

}
