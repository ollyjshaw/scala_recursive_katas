package recursive

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by ollyshaw on 27/11/14.
 */
class SortTest extends FlatSpec with Matchers {
  "Bubble Sort" should "sort the list" in {
    var unsorted = List[Int](2,5,1,7,9)
    Sort.isort(unsorted).toSeq shouldEqual List[Int](1,2,5,7,9).toSeq
  }
}
