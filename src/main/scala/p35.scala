/**
  * Created by rajeevprasanna on 1/29/16.
  */
object p35 extends App {

  //  P35 (**) Determine the prime factors of a given positive integer.
  //  Construct a flat list containing the prime factors in ascending order.
  //    scala> 315.primeFactors
  //  res0: List[Int] = List(3, 3, 5, 7)
  def primeFactors(number: Int, list: List[Int] = List()): List[Int] = {
    for(i <- 2 to number if (number % i == 0)) {
      return primeFactors(number / i, list :+ i)
    }
    list
  }
  println(primeFactors(315))
}
