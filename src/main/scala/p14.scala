/**
  * Created by rajeevprasanna on 1/28/16.
  */
object p14 extends App {

//  P14 (*) Duplicate the elements of a list.
//    Example:
//    scala> duplicate(List('a, 'b, 'c, 'c, 'd))
//  res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)

    val l = List('a, 'b, 'c, 'c, 'd)
    val dup = l flatMap(e => List(e, e))
    println(dup)
}
