/**
  * Created by rajeevprasanna on 1/28/16.
  */
object p18 extends App {

//  P18 (**) Extract a slice from a list.
//    Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
//  Example:
//
//    scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//  res0: List[Symbol] = List('d, 'e, 'f, 'g)

  val (i, k, l) = (3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

//  val res = l.slice(i, k)
//  println(res)
////
//  val res1 = l.take(k) drop(i)
//  println(res1)
//

//
  def slice2[A](i: Int, k: Int, l: List[A]): List[A] = {
    def _slice(cl:Int, cr:Int, rem:List[A]):List[A] = (cl, cr, rem) match  {
      case (0,0, res) => res
      case (0, r, res) => _slice(0, r-1, res.init)
      case (le, re, h::tail) => _slice(le-1, re, tail)
    }
    _slice(i, k-i, l)
  }

  val res2 = slice2(i, k, l)
  println(res2)


}
