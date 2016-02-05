/**
  * Created by rajeevprasanna on 1/28/16.
  */
object p15 extends App {

 //  P15 (**) Duplicate the elements of a list a given number of times.
//  Example:
//    scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
//  res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)

  val (n,l) =  (3, List('a, 'b, 'c, 'c, 'd))
  val res = l flatMap(x => List.fill(n)(x))

  println(res)
}
