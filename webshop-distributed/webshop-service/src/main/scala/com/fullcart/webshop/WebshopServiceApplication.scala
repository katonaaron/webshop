package com.fullcart.webshop

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ApplicationConfig

object WebshopServiceApplication extends App {
  SpringApplication.run(classOf[ApplicationConfig])
}
