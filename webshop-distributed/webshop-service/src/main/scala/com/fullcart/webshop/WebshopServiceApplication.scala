package com.fullcart.webshop

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ApplicationConfig {

  @Bean
  def objectMapper: ObjectMapper = {
    val objectMapper = new ObjectMapper()
    objectMapper.registerModule(DefaultScalaModule)
    objectMapper
  }
}

object WebshopServiceApplication extends App {
  System.setProperty("spring.devtools.restart.enabled", "false")
  SpringApplication.run(classOf[ApplicationConfig])
}
