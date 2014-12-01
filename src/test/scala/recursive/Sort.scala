package recursive

/**
 * Created by ollyshaw on 27/11/14.
 */
object Sort {

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case Nil => List(x)
    case y::ys => if(x<=y) x::xs  else y::insert(x, ys)
  }

  def isort(ints : List[Int]) : List[Int] = ints match {
    case Nil => Nil
    case x::xs => insert(x, isort(xs))
  }

}
