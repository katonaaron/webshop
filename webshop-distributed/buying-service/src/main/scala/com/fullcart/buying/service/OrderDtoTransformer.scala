package com.fullcart.buying.service

import com.fullcart.buying.model.Order
import com.fullcart.dto.OrderDTO
import com.fullcart.service.DtoTransformer
import org.springframework.stereotype.Component

import scala.jdk.CollectionConverters.IterableHasAsScala

@Component
class OrderDtoTransformer extends DtoTransformer[Long, OrderDTO, Order] {
  override def fromDto(dto: OrderDTO): Either[String, Order] = {
    fromDto(dto.id.getOrElse(0L), dto)
  }

  override def fromDto(id: Long, dto: OrderDTO): Either[String, Order] = {
    for {
      price <- dto.price.map(Right(_)).getOrElse(Left("Missing price"))
      userId <- dto.userId.map(Right(_)).getOrElse(Left("Missing user"))
      productIds <- dto.productIds.map(Right(_)).getOrElse(Left("Missing product"))
      productIds <-
        if (productIds.asScala.isEmpty)
          Left("Must specify at least one product")
        else
          Right(productIds)
    } yield new Order(id, price, userId, productIds)
  }

  override def toDto(order: Order): OrderDTO = {
    new OrderDTO(Some(order.id), Some(order.date), Some(order.price), Some(order.status), Some(order.userId), Some(order.productIds))
  }

  override def update(oldOrder: Order, newOrder: OrderDTO): Order = {
    throw new UnsupportedOperationException
  }
}
