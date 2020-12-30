package com.fullcart.user.repository


import com.fullcart.user.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
trait UserRepository extends JpaRepository[User, Long] {
  //  def findByOrdersId(id: Long) : User
}
