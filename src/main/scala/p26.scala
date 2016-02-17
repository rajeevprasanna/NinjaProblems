import scala.annotation.tailrec

/**
  * Created by rajeevprasanna on 1/29/16.
  */
object p26 extends App {

//  P26 (**) Generate the combinations of K distinct objects chosen from the N elements of a list.
//  In how many ways can a committee of 3 be chosen from a group of 12 people? We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the well-known binomial coefficient). For pure mathematicians, this result may be great. But we want to really generate all the possibilities.
//    Example:
//
//    scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
//  res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...

  val (c, l) = (2, List('a, 'b, 'c, 'd, 'e, 'f))
  val res1 = l.combinations(c).toList
//  println(res1)

  val res2 = l.toSet.subsets(c).toList
//  println(res2)


  def combinations1[A](count:Int, list:List[A]):List[List[A]] = {
    def _combinations(l:List[A], res:List[List[A]]):List[List[A]] = l match {
      case Nil => res
      case h::tail => _combinations(tail, res.map(x => x:::List(h))) ::: _combinations(tail, res)
    }
    _combinations(list, List(List())) filter(_.size == c)
  }

  val res3 = combinations1(c, l)
  res3.size


  //Tail recursion
  def combinations12[A](count:Int, list:List[A]):List[List[A]] = {
    @tailrec
    def _combinations(l:List[A], res:List[List[A]]):List[List[A]] = l match {
      case Nil => res
      case h::tail => _combinations(tail, res:::res.map(x => x:::List(h)))
    }
    _combinations(list, List(List())) filter(_.size == count)
  }

  val res12 = combinations12(c, l)
  res12.size

  def combinations2[A](count:Int, list:List[A]):List[List[A]] = {
    @tailrec
    def _combinations(l:List[A], res:List[List[A]]):List[List[A]] = l match {
      case Nil => res.filter(_.size==c)
      case h::tail => _combinations(tail, (res:::res.map(x => x:::List(h))).filter(_.size<=c))
    }
    _combinations(list, List(List()))
  }

  def combinations31[A](count:Int, list:List[A]):List[List[A]] = {
    @tailrec
    def _combinations(l:List[A], res:List[List[A]], eRes:List[List[A]]):List[List[A]] = l match {
      case Nil => (eRes:::res).filter(_.size == c)
      case h::tail =>   val segregation = res.groupBy(x => x.size >= c)
        val left =  segregation.get(true).getOrElse(List(List()))
        val right = segregation.get(false).getOrElse(List(List()))
        _combinations(tail, right:::right.map(x => x:::List(h)),  eRes ::: left)
    }
    _combinations(list, List(List()), Nil)
  }
  val res31 = combinations31(c, l)


  def combinations32[A](count:Int, list:List[A]):List[List[A]] = {
    @tailrec
    def _combinations(l:List[A], res:List[List[A]], eRes:List[List[A]]):List[List[A]] = l match {
      case Nil => (eRes:::res).filter(_.size == c)
      case h::tail =>   val segregation = res.groupBy(x => x.size >= c)
        val left =  segregation.get(true).getOrElse(List(List()))
        val right = segregation.get(false).getOrElse(List(List()))
        _combinations(tail, right:::right.map(x => x:::List(h)),  eRes ::: left)
    }
    _combinations(list, List(List()), Nil)
  }
  val res32 = combinations32(c, l)

}
