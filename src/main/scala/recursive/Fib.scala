package recursive

import scala.annotation.tailrec

object Fib {
  def generateTailRec(i: Int) =  generate(i)

  def generate(i: Int) = {

    @tailrec
   def fibInternal(current:Int, a:Int, b:Int) : Int = current match {
     case 0 => a
     case x => fibInternal(x-1, b, b+a)
   }
    fibInternal(i, 0, 1)
  }
  //1,1,2,3,5,8,
  def main(args: Array[String]) : Unit = {
    println((1 to 10).map(s => (s,generate(s))).mkString("-"))
  }

}
