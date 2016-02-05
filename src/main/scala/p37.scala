/**
  * Created by rajeevprasanna on 1/29/16.
  */
object p37 extends App {

//  P37 (**) Calculate Euler's totient function phi(m) (improved).
//    See problem P34 for the definition of Euler's totient function. If the list of the prime factors of a number m is known in the form of problem P36 then the function phi(m>) can be efficiently calculated as follows:
  // Let [[p1, m1], [p2, m2], [p3, m3], ...] be the list of prime factors (and their multiplicities) of a given number m.
  // Then phi(m) can be calculated with the following formula:
//    phi(m) = (p1-1)*p1(m1-1) * (p2-1)*p2(m2-1) * (p3-1)*p3(m3-1) * ...
//
//  Note that ab stands for the bth power of a.

  def primeFactors(n:Int, res:List[Int] = List()):List[Int] = {
    for(i <- 2 to n if (n%i==0)){
      return primeFactors(n/i, res:+i)
    }
    res
  }
  def factorMap(n:Int) = primeFactors(n).groupBy(x => x).foldLeft(List[(Int, Int)]())((l, r) => l:::List((r._1, r._2.size))).sortBy(_._1)
  def power(a:Int, b:Int):Double = math.pow(a, b)
  def totient(n:Int):Double = factorMap(n).foldLeft(0:Double)((l, e) => l + power(e._1-1, e._2))

  val n:Int = 315
  val res = factorMap(n)
  println(res)
  println("totient => "+ totient(n))

}
