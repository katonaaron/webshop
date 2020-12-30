package com.fullcart.dto

trait DTO[ID] {
  def id: Option[ID]
}

