package com.fullcart.product

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ApplicationConfig

object ProductServiceApplication extends App {
  SpringApplication.run(classOf[ApplicationConfig])
}
