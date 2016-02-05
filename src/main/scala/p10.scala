/**
  * Created by rajeevprasanna on 1/28/16.
  */
object p10 extends App {

  //P10 (*) Run-length encoding of a list.

  //  Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
  //  Example:
  //
  //    scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  //  res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

  val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

  def rle[A](l: List[A]):List[(Int, A)] = {
    def _rle(res: List[(Int, A)], rem: List[A]): List[(Int, A)] = rem match {
      case Nil => res
      case ls => {
        val (rs, ts) = ls span (_ == rem.head)
        _rle(res ::: List((rs.size, rs.head)), ts)
      }
    }
    _rle(List(), l)
  }
  println(rle(l))


  def pack[A](l: List[A]): List[List[A]] = {
    def _pack(res: List[List[A]], rem: List[A]): List[List[A]] = rem match {
      case Nil => res
      case (h :: tail) if res.isEmpty || res.last.head != h => _pack(res ::: List(List(h)), tail)
      case (h :: tail) => _pack(res.init ::: List(res.last ::: List(h)), tail)
    }
    _pack(List(), l)
  }

  def encode[A](l:List[A]):List[(Int, A)] = {
    pack(l) map { e => (e.length, e.head) }
  }

}
