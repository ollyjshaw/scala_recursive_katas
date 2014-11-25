package recursive

import scala.annotation.tailrec

object Fib {
  def generateTailRec(i: Int):Int = ???

  //0,1,1,2,3
  def generate(i: Int):Int = {

    @tailrec
    def internal(intInt:Int, total:Int): Int = intInt match {
      case 0 => total
      case x => internal(x-1, x+total)

    }

    internal(i, 0)
  }

}
