package com.fullcart.buying.model

import com.fullcart.common.model.OrderStatus

import java.util.{Calendar, Date}
import javax.persistence._
import javax.validation.constraints.NotNull
import scala.jdk.CollectionConverters._

@Entity
@Table(name = "USER_ORDER")
class Order {

  @Id
  @GeneratedValue
  var id: Long = _

  var date: Date = Calendar.getInstance().getTime

  @NotNull(message = "Price is mandatory")
  var price: Double = _

  var status: OrderStatus = OrderStatus.IN_PROGRESS

  var userId: Long = _

  @ElementCollection(fetch = FetchType.EAGER)
  @CollectionTable(name = "ORDER_ITEM")
  @Column(name = "product_id")
  private var _productIds: java.util.List[java.lang.Long] = _

  def productIds_=(arg: java.lang.Iterable[Long]): Unit =
    _productIds = arg.asScala.map(long2Long).toList.asJava

  def this(price: Double, userId: Long, productIds: Iterable[Long]) = {
    this(price, userId)
    this.productIds = productIds
  }

  def this(price: Double, userId: Long, productIds: java.lang.Iterable[Long]) = {
    this(price, userId)
    this.productIds = productIds
  }

  def productIds: java.lang.Iterable[Long] =
    _productIds.asScala.map(_.toLong).asJava

  def productIds_=(arg: Iterable[Long]): Unit =
    _productIds = arg.map(long2Long).toList.asJava

  def this(id: Long, price: Double, userId: Long, productIds: java.lang.Iterable[Long]) = {
    this(price, userId, productIds)
    this.id = id
  }

  def this(id: Long, date: Date, price: Double, status: OrderStatus, userId: Long, productIds: java.lang.Iterable[Long]) = {
    this(id, price, userId, productIds)
    this.date = date
    this.status = status
  }

  private def this(price: Double, userId: Long) = {
    this
    this.userId = userId
    this.price = price
  }
}
