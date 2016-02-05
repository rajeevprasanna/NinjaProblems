/**
  * Created by rajeevprasanna on 1/29/16.
  */


object p21 extends App {

  //  P21 (*) Insert an element at a given position into a list.
  //    Example:
  //    scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
  //  res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)

  val (s, i, l) = ('new, 1, List('a, 'b, 'c, 'd))
  val res = l.take(i) ::: List(s) ::: l.drop(i)
  println(res)
}
