package org.example.unit

import org.example.HelloWorld
import org.scalatest.{FlatSpec, Matchers}

class ExampleSpec extends FlatSpec with Matchers {
  behavior of "example project"

  it should "compute text message" in {
    HelloWorld.computeMessage() shouldEqual "sss"
  }

  it should "compute result number" in {
    HelloWorld.computeNumber() shouldEqual 10
  }

}
