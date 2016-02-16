/**
  * Created by rajeevprasanna on 2/10/16.
  */
object PE3 extends App {

  //  The prime factors of 13195 are 5, 7, 13 and 29.
  //  What is the largest prime factor of the number 600851475143 ?

  var limit = 600851475143L
  lazy val primes: Stream[Long] = Stream.cons(2,
    primes.map(x => {
      var tmp = x
        (
          while ((limit % tmp) != 0 && limit != 1) {
          tmp = tmp + 1
          }
         )
        limit = limit / tmp
        tmp
     }
    )
  )
  print(primes.take(10).last)
}