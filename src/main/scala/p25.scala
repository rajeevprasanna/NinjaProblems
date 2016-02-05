/**
  * Created by rajeevprasanna on 1/29/16.
  */
object p25 extends App {


  //  P25 (*) Generate a random permutation of the elements of a list.
//    Hint: Use the solution of problem P23.
//  Example:
//
//    scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
//  res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)

  val  l = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h)
  val res = p23.getRandomElements(l, l.size)
  println(res)
}
