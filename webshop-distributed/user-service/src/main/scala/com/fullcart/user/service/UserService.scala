package com.fullcart.user.service


import com.fullcart.dto.UserDTO
import com.fullcart.service.AbstractService
import com.fullcart.user.model.User
import com.fullcart.user.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
                   private val repository: UserRepository,
                   private val dtoTransformer: UserDtoTransformer
                 ) extends AbstractService[Long, UserDTO, User](repository, dtoTransformer)

