/**
  * Created by rajeevprasanna on 1/29/16.
  */
object p33 extends App {


//  P33 (*) Determine whether two positive integer numbers are coprime.
//    Two numbers are coprime if their greatest common divisor equals 1.
//  scala> 35.isCoprimeTo(64)
//  res0: Boolean = true

  def isCoPrime = (a:Int, b:Int) => (p32.gcd(a, b) == 1)
  println(isCoPrime(35, 64))
}
