/**
  * Created by rajeevprasanna on 1/27/16.
  */
object p06 extends App {
  //P06 (*) Find out whether a list is a palindrome.

  val l = List(1, 2, 3, 2, 1)
  val b = l.sameElements(l.reverse)
  println(b)
}
