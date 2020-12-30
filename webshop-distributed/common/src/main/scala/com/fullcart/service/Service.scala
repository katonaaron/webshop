package com.fullcart.service

import com.fullcart.dto.DTO

trait Service[ID, D <: DTO[ID]] {

  def findById(id: ID): Option[D]

  def findAll(): java.lang.Iterable[D]

  def create(dto: D): Either[String, D]

  def update(id: ID, dto: D): Option[Either[String, D]]

  def replace(id: ID, dto: D): Either[String, D]

  def deleteById(id: ID): Boolean
}
