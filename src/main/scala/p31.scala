/**
  * Created by rajeevprasanna on 1/29/16.
  */
object p31 extends App {

//  P31 (**) Determine whether a given integer number is prime.
//    scala> 7.isPrime
//  res0: Boolean = true

  def isPrime(n:Int):Boolean = (2 until math.sqrt(n).toInt+1).toList.find(n%_== 0).isEmpty
  val primes = (2 to 100).toSeq.filter(isPrime)

  println("count of prime numbers below 100 => "+ primes.length)
  println("prime numbers => "+ primes)
}
