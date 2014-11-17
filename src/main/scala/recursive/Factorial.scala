package recursive

import scala.annotation.tailrec

object Factorial {
  def factorial(i: Int): Int = i match {
    case 0 => 1
    case _ => i * factorial(i - 1)
  }

  def factorialTailRec(i: Int): Int = {
    @tailrec
    def internal(remainder: Int, accumulator: Int): Int = remainder match {
      case 0 => accumulator
      case _ => internal(remainder - 1, accumulator * remainder)
    }

    internal(i, 1)
  }

}
