package com.fullcart.product.repository

import com.fullcart.product.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
trait ProductRepository extends JpaRepository[Product, Long] {
  //  def findByOrdersId(id: Long): java.util.List[Product]
}
