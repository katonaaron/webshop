package com.fullcart.webshop.exception

class UserNotFoundException(id: Long) extends RuntimeException("Could not find user " + id)
