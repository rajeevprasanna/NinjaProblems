/**
  * Created by rajeevprasanna on 1/28/16.
  */
object p16 extends App {

  //  P16 (**) Drop every Nth element from a list.
//  Example:
//    scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//  res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)

  val (n, l) = (3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  val res =  l.zipWithIndex.filter(_._2%3!=2).map(_._1)
  println(res)

 val s = l.grouped(n).flatMap(_.take(n-1)).toList
  println(s)
}
