package com.fullcart.webshop.uriconverter

import com.fullcart.webshop.model.User
import com.fullcart.webshop.repository.UserRepository
import org.springframework.stereotype.Component

@Component
class UserUriConverter(private val repository: UserRepository) extends AbstractUriConverter[User]("users", repository)
