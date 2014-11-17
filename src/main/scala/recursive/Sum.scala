package recursive

import scala.annotation.tailrec

object Sum {
  def tailRecursiveSum(ints: List[Int]): Int = {

    @tailrec
    def internal(remainder: List[Int], acc: Int): Int = remainder match {
      case Nil => acc
      case head :: tail => internal(tail, acc + head)
    }

    internal(ints, 0)
  }

  def recursiveSum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case head :: tail => head + recursiveSum(tail)
  }

}
