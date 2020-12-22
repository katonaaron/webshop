package com.fullcart.webshop.uriconverter

import com.fullcart.webshop.model.Product
import com.fullcart.webshop.repository.ProductRepository
import org.springframework.stereotype.Component

@Component
class ProductUriConverter(private val repository: ProductRepository) extends AbstractUriConverter[Product]("products", repository)
