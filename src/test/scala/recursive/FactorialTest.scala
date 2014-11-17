package recursive

import org.scalatest.{FlatSpec, Matchers}

class FactorialTest extends FlatSpec with Matchers {

  "Factorial" should "work out 0" in {
    Factorial.factorial(0) shouldBe 1
  }

  "Factorial" should "work out 1" in {
    Factorial.factorial(1) shouldBe 1
  }

  "Factorial" should "work out 3" in {
    Factorial.factorial(3) shouldBe 6
  }

  "Factorial tail rec" should "work out 0" in {
    Factorial.factorialTailRec(0) shouldBe 1
  }

  "Factorial tail rec" should "work out 1" in {
    Factorial.factorialTailRec(1) shouldBe 1
  }

  "Factorial tail rec" should "work out 3" in {
    Factorial.factorialTailRec(3) shouldBe 6
  }

}
