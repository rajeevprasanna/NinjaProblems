



import scala.annotation.tailrec

val l = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")

def combinations[A](count:Int, list:List[A]):List[List[A]] = {
  @tailrec
  def _combinations(l:List[A], res:List[List[A]]):List[List[A]] = l match {
    case Nil => res
    case h::tail => _combinations(tail, res:::res.map(x => x:::List(h)))
  }
  _combinations(list, List(List())) filter(_.size == count)
}

def disjointCombinations[A](ls:List[A]):List[List[List[A]]] =
  for{
      a <- combinations(2, ls)
      noA  = ls diff a
      b <- combinations(3, noA)
  } yield List(a, b, noA diff b)

disjointCombinations(l)

def group[A](ns: List[Int], ls: List[A]): List[List[List[A]]] = ns match {
  case Nil     => List(Nil)
  case n :: ns => combinations(n, ls) flatMap { c =>
    group(ns, ls diff c) map {c :: _}
  }
}