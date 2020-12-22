package com.fullcart.webshop.uriconverter

import java.net.URI

trait UriConverter[T] {

  def convert(uri: URI): Option[T]
}
