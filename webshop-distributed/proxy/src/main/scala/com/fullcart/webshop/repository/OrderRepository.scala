package com.fullcart.webshop.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import com.fullcart.webshop.model.Order

@Repository
trait OrderRepository extends  JpaRepository[Order, Long]{
  def findByUserId(id: Long) : java.util.List[Order]
}
