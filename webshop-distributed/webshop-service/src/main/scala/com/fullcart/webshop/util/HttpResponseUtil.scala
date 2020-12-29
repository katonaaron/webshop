package com.fullcart.webshop.util

import org.springframework.hateoas.MediaTypes
import org.springframework.hateoas.mediatype.problem.Problem
import org.springframework.http.{HttpHeaders, HttpStatus, ResponseEntity}

object HttpResponseUtil {
  def createProblemResponse(status: HttpStatus, detail: String): ResponseEntity[Problem] =
    ResponseEntity
      .status(status)
      .header(HttpHeaders.CONTENT_TYPE, MediaTypes.HTTP_PROBLEM_DETAILS_JSON_VALUE)
      .body(Problem.create
        .withTitle(status.getReasonPhrase)
        .withDetail(detail))
}
