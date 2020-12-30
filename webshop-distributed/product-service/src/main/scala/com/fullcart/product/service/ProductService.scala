package com.fullcart.product.service

import com.fullcart.dto.ProductDTO
import com.fullcart.product.model.Product
import com.fullcart.product.repository.ProductRepository
import com.fullcart.service.AbstractService
import org.springframework.stereotype.Service

@Service
class ProductService(
                      private val repository: ProductRepository,
                      private val dtoTransformer: ProductDtoTransformer
                    ) extends AbstractService[Long, ProductDTO, Product](repository, dtoTransformer)
