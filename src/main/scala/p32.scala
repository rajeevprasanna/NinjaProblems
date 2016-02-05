/**
  * Created by rajeevprasanna on 1/29/16.
  */
object p32 extends App {

  //  P32 (**) Determine the greatest common divisor of two positive integer numbers.
  //    Use Euclid's algorithm.
  //  scala> gcd(36, 63)
  //  res0: Int = 9

  def gcd(a: Int, b: Int): Int = (a, b) match {
    case (x, y) if x > y => gcd(y, x)
    case (0, _) => b
    case _ => gcd(b % a, a)
  }

  val g = gcd(36, 63)
  println("GCD of two numbers => " + g)
}
