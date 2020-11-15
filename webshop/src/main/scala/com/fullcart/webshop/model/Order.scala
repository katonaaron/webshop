package com.fullcart.webshop.model

import java.beans.BeanProperty
import java.util.Date

import javax.persistence.{Entity, GeneratedValue, Id}
import org.springframework.lang.NonNull

import scala.beans.BeanProperty

@Entity
class Order {

  @Id
  @GeneratedValue
  @BeanProperty
  var id: Long = _

  @NonNull
  @BeanProperty
  var price: Long = _

  @BeanProperty
  var date: Date = _
}
