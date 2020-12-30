package com.fullcart.webshop.util

import org.springframework.hateoas.mediatype.problem.Problem
import org.springframework.hateoas.{EntityModel, MediaTypes}
import org.springframework.http.{HttpHeaders, HttpStatus, ResponseEntity}

object HttpResponseUtil {
  def problem(status: HttpStatus, detail: String): ResponseEntity[Problem] =
    ResponseEntity
      .status(status)
      .header(HttpHeaders.CONTENT_TYPE, MediaTypes.HTTP_PROBLEM_DETAILS_JSON_VALUE)
      .body(Problem.create
        .withTitle(status.getReasonPhrase)
        .withDetail(detail))

  def withBody[T](status: HttpStatus, entityModel:  EntityModel[T]): ResponseEntity[EntityModel[T]] =
    ResponseEntity
      .status(status)
      .body(entityModel)

  def noBody[T](status: HttpStatus): ResponseEntity[T] =
    ResponseEntity
      .status(status)
      .build()
}
