package recursive

import scala.annotation.tailrec

object Fib {
  def generateTailRec(i: Int) =  generate(i)

  def generate(i: Int) = {
    def fibInternal(i: Int, total: Int) : Int= i match {
      case 0 => total
      case x => fibInternal(x-1, total + x)
    }

    fibInternal(i, 0)
  }


}
