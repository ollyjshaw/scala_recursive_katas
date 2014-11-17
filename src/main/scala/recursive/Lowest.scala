package recursive

import scala.annotation.tailrec

object Lowest {
  def findLowest(ints: List[Int]): Int = {
    @tailrec
    def internal(remainder: List[Int], lowest: Int): Int = remainder match {
      case Nil => lowest
      case head :: tail => if (head < lowest) internal(tail, head) else internal(tail, lowest)
    }

    internal(ints, ints(0))
  }
}
