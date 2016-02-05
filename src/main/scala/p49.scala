/**
  * Created by rajeevprasanna on 1/29/16.
  */
object p49 extends App {

//  P49 (**) Gray code.
//    An n-bit Gray code is a sequence of n-bit strings constructed according to certain rules. For example,
//  n = 1: C(1) = ("0", "1").
//    n = 2: C(2) = ("00", "01", "11", "10").
//    n = 3: C(3) = ("000", "001", "011", "010", "110", "111", "101", "100").
//    Find out the construction rules and write a function to generate Gray codes.
//
//    scala> gray(3)
//  res0 List[String] = List(000, 001, 011, 010, 110, 111, 101, 100)
//  See if you can use memoization to make the function more efficient.

  def grayCodes(n: Int): List[String] = {
    def _grayCodes(n: Int, res: List[String]): List[String] = n match {
      case 0 => res
      case _ =>
        val l = res.map("0" + _) ::: res.reverse.map("1" + _)
        _grayCodes(n - 1, l)
    }
    _grayCodes(n - 1, List("0", "1"))
  }

  val result = grayCodes(2)
  println(result)
}
