package com.fullcart.dto


import javax.validation.constraints.{NotBlank, NotNull}
import scala.beans.BeanProperty

class ProductDTO extends Serializable {

  @BeanProperty
  var id: Long = _

  @NotNull(message = "Price is mandatory")
  @BeanProperty
  var price: Double = _

  @NotBlank(message = "Name is mandatory")
  @BeanProperty
  var name: String = _

  @BeanProperty
  var description: String = _

  def this(id: Long, price: Double, name: String, description: String) = {
    this
    this.id = id
    this.price = price
    this.name = name
    this.description = description
  }

  override def toString = s"ProductDTO($id, $price, $name, $description)"
}
