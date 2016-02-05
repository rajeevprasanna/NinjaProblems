/**
  * Created by rajeevprasanna on 1/29/16.
  */
object p36 extends App {

  def primeFactors(n:Int, res:List[Int] = List()):List[Int] = {
      for(i <- 2 to n if (n%i==0)){
         return primeFactors(n/i, res:+i)
      }
      res
  }

  def factorMap(n:Int) = primeFactors(n).groupBy(x => x).foldLeft(List[(Int, Int)]())((l, r) => l:::List((r._1, r._2.size))).sortBy(_._1)
  println(factorMap(315))
}
