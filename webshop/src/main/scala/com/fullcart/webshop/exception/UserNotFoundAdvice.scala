package com.fullcart.webshop.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.{ControllerAdvice, ExceptionHandler, ResponseBody, ResponseStatus}

@ControllerAdvice
class UserNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(Array(classOf[UserNotFoundException]))
  @ResponseStatus(HttpStatus.NOT_FOUND)
  def userNotFoundHandler(ex: UserNotFoundException): String = ex.getMessage

}
