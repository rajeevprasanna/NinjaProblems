import scala.util.Random

/**
  * Created by rajeevprasanna on 1/29/16.
  */
object p23 extends App {

  //  P23 (**) Extract a given number of randomly selected elements from a list.
  //  Example:
  //    scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
  //  res0: List[Symbol] = List('e, 'd, 'a)
  //  Hint: Use the solution to problem P20

  def getRandomElements[A](l: List[A], n: Int): List[A] = {
    def _random(n: Int, l: List[A]): List[A] = (n, l) match {
      case (0, x) => Nil
      case (i, l) =>
        val index = Random.nextInt(l.size)
        List(l(index)) ::: _random(i - 1, l.take(index) ::: l.drop(index + 1))

    }
    _random(n, l)
  }

  val (n, l) = (4, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h))
  val res = getRandomElements(l, n)
  println(res)
}
