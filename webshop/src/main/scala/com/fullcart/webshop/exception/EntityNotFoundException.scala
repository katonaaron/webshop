package com.fullcart.webshop.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value = HttpStatus.NOT_FOUND)
class EntityNotFoundException(id: Long) extends RuntimeException("Could not find entity with id " + id)
