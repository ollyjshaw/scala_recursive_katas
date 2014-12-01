package recursive

import scala.annotation.tailrec

object Fib {
  def generateTailRec(i: Int):Int = generate(i) //why not

  //0,1,1,2,3
  def generate(i: Int):Int = {

    @tailrec
    def internal(current: Int, total: Int): Int = current match {
      case 0 => total
      case x => internal(current-1, current + total)
    }

    internal(i, 0)

  }

}
