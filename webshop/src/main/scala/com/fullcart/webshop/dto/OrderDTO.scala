package com.fullcart.webshop.dto

import java.net.URI

import javax.validation.constraints.NotNull

import scala.beans.BeanProperty

class OrderDTO {

   @NotNull
   @BeanProperty
   var user: URI = _

   @NotNull
   @BeanProperty
   var products: java.util.List[URI] = _
}
