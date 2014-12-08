package recursive

object Sort {

  def insert(i: Int, ints: List[Int]) : List[Int] = ints match {
    case Nil => List(i)
    case y::ys => if (i<y) i::ints else insert(y, i::ys)
  }

  def isort(ints: List[Int]) : List[Int] = ints match {
    case Nil => Nil
    case x::xs => insert(x, isort(xs))
  }
}
