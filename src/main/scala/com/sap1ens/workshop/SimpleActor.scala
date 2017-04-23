package com.sap1ens.workshop

import akka.actor.{Actor, ActorLogging, Props}

object SimpleActor {
  case class SimpleMessage(content: String)
  
  def props() = Props(classOf[SimpleActor])
}

class SimpleActor extends Actor with ActorLogging {
  import SimpleActor._

  def receive = {
    case SimpleMessage(content) => {
      log.info(s"Received $content")
    }

    case _ => log.warning("Unrecognized message")
  }
}
