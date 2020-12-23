package com.fullcart.webshop.model

import com.fasterxml.jackson.annotation.JsonIgnore

import java.util.{Calendar, Date}
import javax.persistence._
import javax.validation.constraints.NotNull
import scala.beans.BeanProperty
import scala.jdk.CollectionConverters._

@Entity
@Table(name = "USER_ORDER")
class Order {

  @BeanProperty
  val date: Date = Calendar.getInstance().getTime
  @Id
  @GeneratedValue
  @BeanProperty
  var id: Long = _
  @NotNull(message = "Price is mandatory")
  @BeanProperty
  var price: Double = _
  @JsonIgnore
  @ManyToOne
  var user: User = _

  @BeanProperty
  var status: OrderStatus = OrderStatus.IN_PROGRESS

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

  def this(user: User, products: Seq[Product]) {
    this
    this.user = user
    this.products = products.asJava
    this.price = products.map { p => p.price }.sum
    this.status = OrderStatus.IN_PROGRESS
  }
}
