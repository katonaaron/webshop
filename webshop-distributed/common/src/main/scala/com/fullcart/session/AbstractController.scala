package com.fullcart.session

import org.scribble.core.`type`.name.Role
import org.scribble.main.ScribRuntimeException
import org.scribble.runtime.session.{MPSTEndpoint, Session}

abstract class AbstractController[S <: Session, R <: Role, S1] {

  def start(server: MPSTEndpoint[S, R], initialState: S1): Unit = {
    new Thread(() =>
      try {
        try {
          handleRequests(initialState)
        } catch {
          case e: Exception => e.printStackTrace()
        } finally {
          server.close()
        }
      } catch {
        case e: ScribRuntimeException => e.printStackTrace()
      }
    ).start()
  }

  def handleRequests(initialState: S1): Unit
}
