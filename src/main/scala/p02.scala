/**
  * Created by rajeevprasanna on 1/27/16.
  */
object p02 extends App {
  val l = List(1, 1, 2, 3, 5, 8)

  //Find the last but one element
  def printLastButOne(l: List[Int]): Unit = l match {
    case Nil => println("empty list")
    case List(x, y) => println("second Last element is : " + x)
    case (x :: tail) => printLastButOne(tail)
  }
  printLastButOne(l)
}
