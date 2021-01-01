package com.fullcart.buying

import com.fullcart.buying.server.BuyingSessionServer
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ApplicationConfig

object BuyingServiceApplication {

  def main(args: Array[String]): Unit = {
    val context = SpringApplication.run(classOf[ApplicationConfig])

    val buyingSessionServer = context.getBean(classOf[BuyingSessionServer])

    buyingSessionServer.start()
  }
}
