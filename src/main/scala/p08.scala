/**
  * Created by rajeevprasanna on 1/27/16.
  */
object p08 extends App {
  //P08 (**) Eliminate consecutive duplicates of list elements.
  val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

  def compress[A](l:List[A]):List[A] = l match {
    case Nil => Nil
    case h::Nil => List(h)
    case h::tail if h == tail.head => compress(tail)
    case h::tail => h::compress(tail)
  }
  println(compress(l))


  //By using fold left
  def compressf[A](l:List[A]):List[A] = l.foldLeft(List[A]()){
    case (List(), e) => List(e)
    case (l, e) if l.last == e => l
    case (l, e) => l:::List(e)
  }



}
