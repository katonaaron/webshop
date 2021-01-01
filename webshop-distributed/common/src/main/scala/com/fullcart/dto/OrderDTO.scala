package com.fullcart.dto

import com.fasterxml.jackson.annotation.{JsonFormat, JsonIgnoreProperties, JsonProperty}
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fullcart.common.model.OrderStatus
import org.springframework.hateoas.server.core.Relation

import java.util.Date
import scala.beans.BeanProperty
import scala.jdk.CollectionConverters._

trait OrderDTOMixin {
  @JsonDeserialize(contentAs = classOf[Long])
  def id: Option[java.lang.Long]

  @JsonDeserialize(contentAs = classOf[Date])
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
  def date: Option[Date]
}

@Relation(value = "order", collectionRelation = "orders")
@JsonIgnoreProperties(Array("productIds", "userId"))
class OrderDTO(
                @BeanProperty
                var id: Option[Long],

                @BeanProperty
                var date: Option[Date],

                @BeanProperty
                var price: Option[Double],

                @BeanProperty
                var status: Option[OrderStatus],

                @JsonProperty("userId")
                var userId: Option[Long],


                @JsonProperty("productIds")
                var productIds: Option[java.lang.Iterable[Long]]

              ) extends DTO[Long] with Serializable {

  def user: Option[java.lang.Long] =
    userId.map(long2Long)

  def user_=(id: Option[java.lang.Long]): Unit =
    userId = id.map(_.toLong)

  def products: Option[java.lang.Iterable[java.lang.Long]] =
    productIds.map(x => x.asScala.map(long2Long).asJava)

  def products_=(ids: Option[java.lang.Iterable[java.lang.Long]]): Unit =
    productIds = ids.map(x => x.asScala.map(_.toLong).asJava)

  def this() = {
    this(None, None, None, None, None, None)
  }

  override def toString = s"OrderDTO($id, $date, $price, $status, $userId, $productIds)"
}
