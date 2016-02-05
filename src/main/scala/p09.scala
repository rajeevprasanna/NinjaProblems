/**
  * Created by rajeevprasanna on 1/27/16.
  */
object p09 extends App {
  //P09 (**) Pack consecutive duplicates of list elements into sublists.

  //If a list contains repeated elements they should be placed in separate sublists.
  val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

  def pack[A](l: List[A]): List[List[A]] = {
    def _pack(res: List[List[A]], rem: List[A]): List[List[A]] = rem match {
      case Nil => res
      case (h :: tail) if res.isEmpty || res.last.head != h => _pack(res ::: List(List(h)), tail)
      case (h :: tail) => _pack(res.init ::: List(res.last ::: List(h)), tail)
    }
    _pack(List(), l)
  }

  println(pack(l))


  def pack2[A](l: List[A]): List[List[A]] = {
    def _pack(res: List[List[A]], rem: List[A]): List[List[A]] = rem match {
      case Nil => res
      case ls => {
        val (rs: List[A], ts: List[A]) = ls span {
          _ == rem.head
        }
        _pack(res ::: List(rs), ts)
      }
    }
    _pack(List(), l)
  }

  println(pack2(l))


}
