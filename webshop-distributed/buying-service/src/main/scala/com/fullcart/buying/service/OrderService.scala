package com.fullcart.buying.service

import com.fullcart.buying.model.Order
import com.fullcart.buying.repository.OrderRepository
import com.fullcart.common.model.OrderStatus
import com.fullcart.dto.{OrderDTO, ProductDTO, UserDTO}
import com.fullcart.service.AbstractService
import org.springframework.stereotype.Service

import scala.jdk.OptionConverters.RichOptional

sealed abstract class ResultStatus

case class StatusNotFound() extends ResultStatus

case class StatusNotAllowed() extends ResultStatus


@Service
class OrderService(
                    private val repository: OrderRepository,
                    private val dtoTransformer: OrderDtoTransformer
                  ) extends AbstractService[Long, OrderDTO, Order](repository, dtoTransformer) {

  def create(user: UserDTO, products: Iterable[ProductDTO]): OrderDTO = {
    val price = products
      .flatMap(dto => dto.price)
      .sum

    val productIds = products
      .flatMap(dto => dto.id)

    val order = new Order(price, user.id.get, productIds)
    dtoTransformer.toDto(repository.save(order))
  }

  def cancel(id: Long): Either[ResultStatus, OrderDTO] = {
    repository
      .findById(id)
      .toScala
    match {
      case Some(order) =>
        if (order.status eq OrderStatus.IN_PROGRESS) {
          order.status = OrderStatus.CANCELLED
          Right(repository.save(order))
            .map(dtoTransformer.toDto)
        } else {
          Left(StatusNotAllowed())
        }
      case None =>
        Left(StatusNotFound())
    }
  }

  def complete(id: Long): Either[ResultStatus, OrderDTO] = {
    repository
      .findById(id)
      .toScala
    match {
      case Some(order) =>
        if (order.status eq OrderStatus.IN_PROGRESS) {
          order.status = OrderStatus.COMPLETED
          Right(repository.save(order))
            .map(dtoTransformer.toDto)
        } else {
          Left(StatusNotAllowed())
        }
      case None =>
        Left(StatusNotFound())
    }
  }
}
