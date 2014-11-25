package recursive

import scala.annotation.tailrec

object Factorial {
  def factorialTailRec(i: Int) : Int = {
    @tailrec
    def internal(current: Int, total:Int): Int = current match {
      case 0 => total
      case 1 => total
      case x => internal(x-1, x * total)
    }

    internal(i, 1)
  }

  def factorial(i: Int) :Int = i match {
    case 0 => 1
    case 1 => 1
    case x => x * factorial(x-1)
  }


}
