/**
  * Created by rajeevprasanna on 2/17/16.
  */

/*
    P41 (**) A list of Goldbach compositions.
    Given a range of integers by its lower and upper limit, print a list of all even numbers and their Goldbach composition.
      scala> printGoldbachList(9 to 20)
    10 = 3 + 7
    12 = 5 + 7
    14 = 3 + 11
    16 = 3 + 13
    18 = 5 + 13
    20 = 3 + 17
    In most cases, if an even number is written as the sum of two prime numbers, one of them is very small. Very rarely, the primes are both bigger than, say, 50. Try to find out how many such cases there are in the range 2..3000.

      Example (minimum value of 50 for the primes):

    scala> printGoldbachListLimited(1 to 2000, 50)
    992 = 73 + 919
    1382 = 61 + 1321
    1856 = 67 + 1789
    1928 = 61 + 1867
*/
object p41 extends App {
  
  def primes(n:Int):Set[Int] = (2 to math.sqrt(n).toInt).foldLeft((2 to n).toSet){ (ps, x) =>
    if(ps(x)) ps -- (x*x to n by x)
    else ps
  }

  def listPrimesinRange(r:Range):List[Int] = primes(r.last).toList.sorted.dropWhile(_ < r.head)


  def goldbachPairs(n:Int):Set[(Int, Int)] = {
    val allPrimes = primes(n)
    allPrimes.collect{
      case i:Int if i< n/2 && allPrimes(i) && allPrimes(n-i) => (i, n-i)
    }
  }

  def printGoldbachList(r:Range) = r.filter(_%2==0).flatMap(goldbachPairs(_))
  printGoldbachList(9 to 20)
}
