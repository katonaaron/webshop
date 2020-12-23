package com.fullcart.webshop.repository

import com.fullcart.webshop.model.Order
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
trait OrderRepository extends  JpaRepository[Order, Long]{
  def findByUserId(id: Long) : java.util.List[Order]
}
