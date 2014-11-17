package recursive

import org.scalatest.{FlatSpec, Matchers}

class SumTest extends FlatSpec with Matchers {

  "Recursive Sum" should "Sum something simple" in {
    Sum.recursiveSum(List(1, 2, 3)) shouldBe 6
  }

  "Tail Recursive Sum" should "Sum something simple" in {
    Sum.tailRecursiveSum(List(1, 2, 3)) shouldBe 6
  }

}