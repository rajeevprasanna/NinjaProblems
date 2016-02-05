/**
  * Created by rajeevprasanna on 1/29/16.
  */
object p34 extends App {

//  P34 (**) Calculate Euler's totient function phi(m).
//    Euler's so-called totient function phi(m) is defined as the number of positive integers r (1 <= r <= m) that are coprime to m.
//  scala> 10.totient
//  res0: Int = 4

  def gcd(a: Int, b: Int): Int = (a, b) match {
    case (x, y) if x > y => gcd(y, x)
    case (0, _) => b
    case _ => gcd(b % a, a)
  }
  def isCoPrime = (a:Int, b:Int) => (p32.gcd(a, b) == 1)

  def totient(n: Int): Int = {
    def part = isCoPrime(n, _: Int)
    val cur = isCoPrime.curried
    val part2 = cur(n)
    (1 to n).toList.filter(part2).size
  }

  println(totient(10))

}
