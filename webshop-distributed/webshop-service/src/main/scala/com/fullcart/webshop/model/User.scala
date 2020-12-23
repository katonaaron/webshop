package com.fullcart.webshop.model

import com.fasterxml.jackson.annotation.JsonIgnore

import java.util
import javax.persistence.{Entity, GeneratedValue, Id, OneToMany}
import javax.validation.constraints.{Email, NotBlank}
import scala.beans.BeanProperty

@Entity
class User extends Serializable {

  @Id
  @GeneratedValue
  @BeanProperty
  var id: Long = _

  @NotBlank(message = "First name is mandatory")
  @BeanProperty
  var firstName: String = _

  @NotBlank(message = "Last name is mandatory")
  @BeanProperty
  var lastName: String = _


  @NotBlank(message = "Email is mandatory")
  @Email(message = "Email is not valid")
  @BeanProperty
  var email: String = _

  @JsonIgnore
  @OneToMany(mappedBy = "user")
  val orders: java.util.List[Order] = new util.ArrayList[Order]()

}
