/**
  * Created by rajeevprasanna on 2/17/16.
  */
object p40 extends App {
//  P40 (**) Goldbach's conjecture.
//  Goldbach's conjecture says that every positive even number greater than 2 is the sum of two prime numbers. E.g. 28 = 5 + 23. It is one of the most famous facts in number theory that has not been proved to be correct in the general case. It has been numerically confirmed up to very large numbers (much larger than Scala's Int can represent). Write a function to find the two prime numbers that sum up to a given even integer.
//    scala> 28.goldbach
//  res0: (Int, Int) = (5,23)

  def primes(n:Int):Set[Int] = (2 to math.sqrt(n).toInt).foldLeft((2 to n).toSet){ (ps, x) =>
    if(ps(x)) ps -- (x*x to n by x)
    else ps
  }

  def goldbachPairs(n:Int):Set[(Int, Int)] = {
    val allPrimes = primes(n)
    allPrimes.collect{
      case i:Int if i< n/2 && allPrimes(i) && allPrimes(n-i) => (i, n-i)
    }
  }

  goldbachPairs(28)



}
