package com.fullcart.webshop

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.fullcart.dto.ProductDTO
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

trait IdMixin {
  @JsonDeserialize(contentAs = classOf[Long])
  def id: Option[java.lang.Long]
}

@SpringBootApplication
class ApplicationConfig {

  @Bean
  def objectMapper: ObjectMapper = {
    val objectMapper = new ObjectMapper()
    objectMapper
      .registerModule(DefaultScalaModule)
      .addMixIn(classOf[ProductDTO], classOf[IdMixin])
    objectMapper
  }
}

object WebshopServiceApplication extends App {
  System.setProperty("spring.devtools.restart.enabled", "false")
  SpringApplication.run(classOf[ApplicationConfig])
}
