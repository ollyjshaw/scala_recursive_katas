package recursive

import org.scalatest.{FlatSpec, Matchers}

class LowestTest extends FlatSpec with Matchers {

  "Lowest" should "find the lowest in something simple" in {
    Lowest.findLowest(List(7, 1, 2, 3)) shouldBe 1
  }

}
