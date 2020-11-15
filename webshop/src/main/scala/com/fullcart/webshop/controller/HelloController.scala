package com.fullcart.webshop.controller

import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class HelloController {

  @GetMapping(Array("/"))
  def sendHello(): String = "Hello There!"
}
