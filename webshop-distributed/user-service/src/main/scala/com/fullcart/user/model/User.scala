package com.fullcart.user.model

import javax.persistence.{Entity, GeneratedValue, Id}
import javax.validation.constraints.{Email, NotBlank}

@Entity
class User {

  @Id
  @GeneratedValue
  var id: Long = _

  @NotBlank(message = "First name is mandatory")
  var firstName: String = _

  @NotBlank(message = "Last name is mandatory")
  var lastName: String = _


  @NotBlank(message = "Email is mandatory")
  @Email(message = "Email is not valid")
  var email: String = _

  //  @OneToMany(mappedBy = "user")
  //  val orders: java.util.List[Order] = new util.ArrayList[Order]()

  def this(id: Long, firstName: String, lastName: String, email: String) = {
    this
    this.id = id
    this.firstName = firstName
    this.lastName = lastName
    this.email = email
  }
}
