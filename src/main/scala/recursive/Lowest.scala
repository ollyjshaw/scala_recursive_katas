package recursive

import scala.annotation.tailrec

object Lowest {
  def findLowest(ints: List[Int]):Int = {
    @tailrec
    def internal (internalInts: List[Int], lowest:Int) :Int = internalInts match {
      case Nil => lowest
      case x::xs => if (x<lowest) internal(xs, x) else internal(xs, lowest)
    }
    internal(ints, Int.MaxValue)
  }


}
