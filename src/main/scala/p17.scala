/**
  * Created by rajeevprasanna on 1/28/16.
  */
object p17 extends App {

//  P17 (*) Split a list into two parts.
//    The length of the first part is given. Use a Tuple for your result.
//  Example:
//
//    scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//  res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

  val (n, l) = (3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

  val s = l.splitAt(n)
  println(s)

  val s2 = (l.take(n), l.drop(n))
  println(s2)

  val s3 = (l.take(n), l.takeRight(l.length-n))
  println(s3)


}
