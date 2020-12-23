package com.fullcart.user

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ApplicationConfig

object UserServiceApplication extends App {
  SpringApplication.run(classOf[ApplicationConfig])
}
