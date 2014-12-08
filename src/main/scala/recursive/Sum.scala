package recursive

import scala.annotation.tailrec

object Sum {
  def tailRecursiveSum(ints: List[Int]) = {
    @tailrec
    def sumInternal(remaining: List[Int], total:Int) :Int = remaining match{
      case Nil => total
      case x::xs => sumInternal(xs, total+x)
    }
    sumInternal(ints, 0)
  }

  def recursiveSum(ints: List[Int]):Int = ints match {
    case Nil => 0
    case x::xs => x + recursiveSum(xs)
  }


}
