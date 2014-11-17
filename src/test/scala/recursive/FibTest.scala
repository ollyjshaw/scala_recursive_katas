package recursive

import org.scalatest.{FlatSpec, Matchers}

class FibTest extends FlatSpec with Matchers {

  it should "calculate the first fibonacci number" in {
    Fib.generate(0) shouldBe 0
  }

  it should "calculate the tenth fibonacci numbers" in {
    Fib.generate(10) shouldBe 55
  }

  "Tail Recursive" should "calculate the first fibonacci number" in {
    Fib.generateTailRec(0) shouldBe 0
  }

  "Tail Recursive" should "calculate the tenth fibonacci numbers" in {
    Fib.generateTailRec(10) shouldBe 55
  }

}
