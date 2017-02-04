name := """scala-akka-workshop"""

version := "1.0"

scalaVersion := "2.12.1"

val akkaVersion = "2.4.16"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "com.typesafe" % "config" % "1.3.1",
  "ch.qos.logback" % "logback-classic" % "1.1.9"
)

lazy val logback = "ch.qos.logback" % "logback-classic" % "1.1.9"
