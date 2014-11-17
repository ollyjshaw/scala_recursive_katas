package recursive

import scala.annotation.tailrec

object Fib {
  def generateTailRec(i: Int) = {
    @tailrec
    def loop(n: Int, prev: Int, cur: Int): Int =
      if (n == 0) prev
      else loop(n - 1, cur, prev + cur)
    loop(i, 0, 1)
  }

  def generate(number: Int): Int = {
    def internal(n: Int, x: Int = 0, y: Int = 0): Int = n match {
      case 0 => 0
      case 1 => 1
      case _ => internal(n - 1) + internal(n - 2)
    }
    internal(number, 0, 1)
  }
}
