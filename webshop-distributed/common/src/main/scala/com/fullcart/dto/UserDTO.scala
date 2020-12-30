package com.fullcart.dto

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import org.springframework.hateoas.server.core.Relation

import scala.beans.BeanProperty

trait UserDTOMixin {
  @JsonDeserialize(contentAs = classOf[Long])
  def id: Option[java.lang.Long]
}


@Relation(value = "user", collectionRelation = "users")
class UserDTO(
               @BeanProperty
               var id: Option[Long],

               @BeanProperty
               var firstName: Option[String],

               @BeanProperty
               var lastName: Option[String],

               @BeanProperty
               var email: Option[String]

             ) extends DTO[Long] with Serializable {

  def this() = {
    this(None, None, None, None)
  }

  override def toString = s"UserDTO($id, $firstName, $lastName, $email)"
}
