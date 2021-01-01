package com.fullcart.user

import com.fullcart.user.server.{BuyingSessionServer, UserSessionServer}
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ApplicationConfig

object UserServiceApplication {

  val PortProperty = "fullcart.user-service.port"

  def main(args: Array[String]): Unit = {
    val context = SpringApplication.run(classOf[ApplicationConfig])

    val userSessionServer = context.getBean(classOf[UserSessionServer])
    val buyingSessionServer = context.getBean(classOf[BuyingSessionServer])

    userSessionServer.start()
    buyingSessionServer.start()
  }
}
