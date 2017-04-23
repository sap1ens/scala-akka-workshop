package com.sap1ens.workshop

import java.nio.file.{Files, Paths}

import scala.io.Source

object Helpers {
  def downloadContent(url: String): String = {
    Source.fromURL(url).mkString
  }

  def createFile(content: String, path: String) = {
    Files.write(Paths.get(path), content.getBytes)
  }
}
