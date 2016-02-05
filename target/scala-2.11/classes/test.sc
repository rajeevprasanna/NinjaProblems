



val res = List(3,3,5,7,7).groupBy(x => x)
//o/p res: scala.collection.immutable.Map[Int,List[Int]] = Map(5 -> List(5), 7 -> List(7, 7), 3 -> List(3, 3))

val res1 = List(3,3,5,7,7).groupBy(x => x).map(x => (x._2.size, x._1))
//o:p res1: scala.collection.immutable.Map[Int,Int] = Map(1 -> 5, 2 -> 3)
