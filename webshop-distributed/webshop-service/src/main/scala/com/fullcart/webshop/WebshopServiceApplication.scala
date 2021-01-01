package com.fullcart.webshop

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.fullcart.dto._
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ApplicationConfig {

  @Bean
  def objectMapper: ObjectMapper = {
    val objectMapper = new ObjectMapper()
    objectMapper
      .registerModule(DefaultScalaModule)
      .addMixIn(classOf[ProductDTO], classOf[ProductDTOMixin])
      .addMixIn(classOf[UserDTO], classOf[UserDTOMixin])
      .addMixIn(classOf[OrderDTO], classOf[OrderDTOMixin])
    objectMapper
  }
}

object WebshopServiceApplication extends App {
  System.setProperty("spring.devtools.restart.enabled", "false")
  SpringApplication.run(classOf[ApplicationConfig])
}
