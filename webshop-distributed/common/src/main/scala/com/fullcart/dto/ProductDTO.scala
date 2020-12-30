package com.fullcart.dto


import org.springframework.hateoas.server.core.Relation

import scala.beans.BeanProperty



@Relation(value = "product", collectionRelation = "products")
class ProductDTO(
                  @BeanProperty
                  var id: Option[Long],

                  @BeanProperty
                  var price: Option[Double],

                  @BeanProperty
                  var name: Option[String],

                  @BeanProperty
                  var description: Option[String]

                ) extends DTO[Long] with Serializable {

  def this() = {
    this(None, None, None, None)
  }

  override def toString = s"ProductDTO($id, $price, $name, $description)"
}
