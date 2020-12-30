package com.fullcart.product.service

import com.fullcart.dto.ProductDTO
import com.fullcart.product.model.Product
import com.fullcart.service.DtoTransformer
import org.springframework.stereotype.Component

@Component
class ProductDtoTransformer extends DtoTransformer[Long, ProductDTO, Product] {
  override def fromDto(dto: ProductDTO): Either[String, Product] = {
    fromDto(dto.id.getOrElse(0L), dto)
  }

  override def fromDto(id: Long, dto: ProductDTO): Either[String, Product] = {
    for {
      price <- dto.price.map(Right(_)).getOrElse(Left("Missing price"))
      name <- dto.name.map(Right(_)).getOrElse(Left("Missing name"))
      description <- dto.description.map(Right(_)).getOrElse(Left("Missing description"))
    } yield new Product(id, price, name, description)
  }

  override def toDto(product: Product): ProductDTO = {
    new ProductDTO(Some(product.id), Some(product.price), Some(product.name), Some(product.description))
  }

  override def update(oldProduct: Product, newProduct: ProductDTO): Product = {
    val id = oldProduct.id
    val price = newProduct.price.getOrElse(oldProduct.price)
    val name = newProduct.name.getOrElse(oldProduct.name)
    val description = newProduct.description.getOrElse(oldProduct.description)
    new Product(id, price, name, description)
  }
}
