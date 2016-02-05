/**
  * Created by rajeevprasanna on 1/28/16.
  */
object p12 extends App {

  //(**) Decode a run-length encoded list.
  //  Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
  //  Example:
  //
  //    scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  //  res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

  def decodeList[A](l: List[(Int, A)]): List[A] = {
    def _dec(res: List[A], rem: List[(Int, A)]): List[A] = rem match {
      case Nil => res
      case head :: tail => _dec(res ::: List.fill(head._1)(head._2), tail)
    }
    _dec(List(), l)
  }

  val l = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
  val decodedList = decodeList(l)
  println(decodedList)


 val x2 =  l flatMap{e => List.fill(e._1)(e._2)}
  println(x2)
}
