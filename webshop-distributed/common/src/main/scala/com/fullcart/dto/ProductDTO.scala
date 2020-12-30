package com.fullcart.dto


import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import org.springframework.hateoas.server.core.Relation

import scala.beans.BeanProperty

trait ProductDTOMixin {
  @JsonDeserialize(contentAs = classOf[Long])
  def id: Option[java.lang.Long]
}


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
