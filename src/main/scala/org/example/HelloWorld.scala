package org.example

object HelloWorld {

  def computeMessage(): String = {
    "sss"
  }

  def computeNumber(): Int = {
    10
  }

  def main(args: Array[String]): Unit = {
    val message = computeMessage()
    val number = computeNumber()
    println(message + number)
  }
}
