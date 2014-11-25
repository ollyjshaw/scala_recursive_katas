package recursive

import scala.annotation.tailrec

object Sum {
  def tailRecursiveSum(ints: List[Int]) = {

    @tailrec
    def internal(internalInts: List[Int], counter:Int):Int = internalInts match {
      case Nil => counter
      case x::xs => internal(xs, x+counter)
    }

    internal(ints, 0)
  }

  def recursiveSum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case x::xs => x + recursiveSum(xs)
  }


}
