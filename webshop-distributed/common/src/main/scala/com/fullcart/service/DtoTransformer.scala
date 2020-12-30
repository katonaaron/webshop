package com.fullcart.service

import com.fullcart.dto.DTO

trait DtoTransformer[ID, D <: DTO[ID], M] {

  def fromDto(dto: D): Either[String, M]

  def fromDto(id: ID, dto: D): Either[String, M]

  def toDto(model: M): D

  def update(oldModel: M, dto: D): M
}
