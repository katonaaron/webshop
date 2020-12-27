package com.fullcart.buying

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ApplicationConfig

object BuyingServiceApplication extends App {
  SpringApplication.run(classOf[ApplicationConfig])
}
