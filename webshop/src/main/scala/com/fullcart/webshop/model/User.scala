package com.fullcart.webshop.model

import javax.persistence.{Entity, GeneratedValue, Id}
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

  //  @OneToMany(mappedBy = "user")
  //  val orders : Set[Order] = _

}
