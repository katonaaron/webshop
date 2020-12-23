package com.fullcart.webshop.transformer

import com.fullcart.webshop.dto.OrderDTO
import com.fullcart.webshop.model.{Order, Product, User}
import com.fullcart.webshop.uriconverter.UriConverter
import org.springframework.stereotype.Component

import scala.jdk.CollectionConverters._

@Component
class OrderDTOTransformer(private val userUriConverter: UriConverter[User], private val productUriConverter: UriConverter[Product]) {

  def transform(orderDTO: OrderDTO): Option[Order] = {
    if (orderDTO.user == null || orderDTO.products == null)
      return None

    userUriConverter.convert(orderDTO.user)
    match {
      case Some(user) =>
        val products: Seq[Product] = orderDTO.products.asScala
          .flatMap { productURI =>
            productUriConverter.convert(productURI)
          }.toSeq

        if (products.isEmpty)
          None
        else
          Some(new Order(user, products))
      case None =>
        None
    }
  }
}
