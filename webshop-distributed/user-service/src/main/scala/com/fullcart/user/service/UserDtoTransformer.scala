package com.fullcart.user.service

import com.fullcart.dto.UserDTO
import com.fullcart.service.DtoTransformer
import com.fullcart.user.model.User
import org.springframework.stereotype.Component

@Component
class UserDtoTransformer extends DtoTransformer[Long, UserDTO, User] {
  def fromDto(dto: UserDTO): Either[String, User] = {
    fromDto(dto.id.getOrElse(0L), dto)
  }

  def fromDto(id: Long, dto: UserDTO): Either[String, User] = {
    for {
      firstName <- dto.firstName.map(Right(_)).getOrElse(Left("Missing first name"))
      lastName <- dto.lastName.map(Right(_)).getOrElse(Left("Missing last name"))
      email <- dto.email.map(Right(_)).getOrElse(Left("Missing email address"))
    } yield new User(id, firstName, lastName, email)
  }

  def toDto(user: User): UserDTO = {
    new UserDTO(Some(user.id), Some(user.firstName), Some(user.lastName), Some(user.email))
  }

  def update(oldUser: User, newUser: UserDTO): User = {
    val id = oldUser.id
    val firstName = newUser.firstName.getOrElse(oldUser.firstName)
    val lastName = newUser.lastName.getOrElse(oldUser.lastName)
    val email = newUser.email.getOrElse(oldUser.email)
    new User(id, firstName, lastName, email)
  }
}
