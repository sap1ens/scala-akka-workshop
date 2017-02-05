package com.sap1ens.workshop

import akka.actor.ActorSystem
import com.sap1ens.workshop.JobExecutor.DownloadRequest

object JobQueueApplication extends App {
  implicit val system = ActorSystem("job-queue")
  
  val jobExecutor = system.actorOf(JobExecutor.props())

  jobExecutor ! DownloadRequest("https://www.google.com/robots.txt", "/tmp/robots1.txt")
  jobExecutor ! DownloadRequest("https://www.google.com/robots.txt", "/tmp/robots2.txt")
  jobExecutor ! DownloadRequest("https://www.google.com/robots.txt", "/tmp/robots3.txt")
  jobExecutor ! DownloadRequest("https://www.google.com/robots.txt", "/tmp/robots4.txt")
  jobExecutor ! DownloadRequest("https://www.google.com/robots.txt", "/tmp/robots5.txt")
}
