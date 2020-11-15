package com.fullcart.webshop.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import com.fullcart.webshop.model.Product

@Repository
trait ProductRepository extends JpaRepository[Product, Long]{

}
