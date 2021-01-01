package com.fullcart.product

import com.fullcart.product.server.{BuyingSessionServer, ProductSessionServer}
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ApplicationConfig


object ProductServiceApplication {

  val PortProperty = "fullcart.product-service.port"

  def main(args: Array[String]): Unit = {
    val context = SpringApplication.run(classOf[ApplicationConfig])

    val productSessionServer = context.getBean(classOf[ProductSessionServer])
    val buyingSessionServer = context.getBean(classOf[BuyingSessionServer])

    productSessionServer.start()
    buyingSessionServer.start()
  }
}
