/**
  * Created by rajeevprasanna on 1/29/16.
  */

object p22 extends App {

//  P22 (*) Create a list containing all integers within a given range.
//    Example:
//    scala> range(4, 9)
//  res0: List[Int] = List(4, 5, 6, 7, 8, 9)

  def range(i:Int, j:Int):List[Int] = {
    def _range(i:Int,  res:List[Int]):List[Int] = i match {
      case x if i > j => res
      case x => _range(i+1, res ::: List(i))
    }
    _range(i, List())
  }
  val (i, j) = (4, 9)
  val res = range(i, j)
  println(res)




}
