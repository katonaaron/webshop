package com.fullcart.webshop.model

import java.util.{Calendar, Date}

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.{Entity, GeneratedValue, Id, ManyToMany, ManyToOne, OneToMany, Table}
import javax.validation.constraints.NotNull
import org.springframework.lang.NonNull

import scala.beans.BeanProperty

@Entity
@Table(name = "USER_ORDER")
class Order {

  @Id
  @GeneratedValue
  @BeanProperty
  var id: Long = _

  @NotNull(message = "Price is mandatory")
  @BeanProperty
  var price: Double = _

  @BeanProperty
  val date: Date = Calendar.getInstance().getTime

  @JsonIgnore
  @ManyToOne
  val user: User = null
}
