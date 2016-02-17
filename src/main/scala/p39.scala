/**
  * Created by rajeevprasanna on 1/29/16.
  */
object p39 extends App {


//  P39 (*) A list of prime numbers.
//  Given a range of integers by its lower and upper limit, construct a list of all prime numbers in that range.
//  scala> listPrimesinRange(7 to 31)
//  res0: List[Int] = List(7, 11, 13, 17, 19, 23, 29, 31)

  def listPrimesinRange(l:Int, u:Int):List[Int] = {
    def primes(n:Int) = (2 to math.sqrt(n).toInt).foldLeft((2 to n).toSet){ (ps, x) =>
        if(ps(x)) ps -- (x*x to n by x)
        else ps
    }
    primes(u).toList.sorted.dropWhile(_ < l)
  }
  val p = listPrimesinRange(7, 31)
  println(p)
}
