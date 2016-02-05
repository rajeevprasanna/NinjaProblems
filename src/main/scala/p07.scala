/**
  * Created by rajeevprasanna on 1/27/16.
  */
object p07 extends App {
  //  P07 (**) Flatten a nested list structure.

  val l = List(List(1, 1), List(3, List(5, 8)))
  println(flattenList(l))

  def flattenList(l: List[Any]): List[Any] = l match {
    case Nil => Nil
    case (h: List[_]) :: tail => flattenList(h) ::: flattenList(tail)
    case h :: tail => h :: flattenList(tail)
  }

}
