package com.fullcart.webshop.model

import java.util
import java.util.{Calendar, Date}

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.{CascadeType, Entity, FetchType, GeneratedValue, Id, JoinColumn, JoinTable, ManyToMany, ManyToOne, OneToMany, Table}
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

  @JsonIgnore
  @ManyToMany(
    fetch = FetchType.LAZY
  )
  @JoinTable(
    name = "order_item",
    joinColumns = Array(new JoinColumn(name = "order_id")),
    inverseJoinColumns = Array(new JoinColumn(name = "product_id"))
  )
  var products: java.util.List[Product] = _
}
