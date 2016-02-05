/**
  * Created by rajeevprasanna on 1/27/16.
  */
object p03 extends App {
//  Find the Kth element of a list.

  val l = List(1, 1, 2, 3, 5, 8)
  val k = 6
  val e:Option[(Int, Int)]  = l.zipWithIndex.filter(_._2 == k).headOption
  println(e.map(_._1))
}
