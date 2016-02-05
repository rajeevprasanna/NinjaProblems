/**
  * Created by rajeevprasanna on 1/29/16.
  */
object p24 extends App {

  //  P24 (*) Lotto: Draw N different random numbers from the set 1..M.
  //    Example:
  //    scala> lotto(6, 49)
  //  res0: List[Int] = List(23, 1, 17, 33, 21, 37)

  val (n, r) = (6, 49)
  val res = p23.getRandomElements((1 to r).toList, n)
  println(res)

}
