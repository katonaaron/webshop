package com.fullcart.webshop.uriconverter

import org.springframework.data.repository.CrudRepository
import org.springframework.web.util.UriTemplate

import java.net.URI

abstract class AbstractUriConverter[T](private val resourceName: String, private val repository: CrudRepository[T, Long]) extends UriConverter[T] {

  override def convert(uri: URI): Option[T] = {
    val id = new UriTemplate(s"/$resourceName/{id}")
      .`match`(uri.toASCIIString)
      .get("id")
      .toLong

    repository.findById(id)
      .map { entity =>
        Some(entity).asInstanceOf[Option[T]]
      }
      .orElse(None)
  }

}
