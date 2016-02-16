import scala.collection.mutable
import scala.concurrent.duration.Duration

/**
  * Created by rajeevprasanna on 1/29/16.
  */
object Test extends App{


  import scala.io.Source
  import scala.util.parsing.json._


  //val fileName = "/Users/rajeevprasanna/Desktop/resp.json"
  //val fileContent = Source.fromFile(fileName).getLines().mkString

  def parseJsonUrls(jsonStr:String, tree:List[String]) = {

    def _parseJsonUrls(jsonObj:Any, tree:List[String], res:List[Any]): Any = jsonObj match {


      case Some(x) => println("Some(x) => "+x)
        _parseJsonUrls(x, tree, res)


      case None =>  println("None")
        res


      case x:List[Any] =>       println("List(x) => "+x)
        val temp = x.asInstanceOf[List[Any]]
        val tempRes = temp map(y => _parseJsonUrls(y, tree, res))
        val finalRes = res:::tempRes
        println("Final result => "+ finalRes)
        finalRes


      case x:Map[String, Any] if !tree.isEmpty  =>       println("Map(x)  ==> " + x)
        val temp = x.asInstanceOf[Map[String, Any]]
        var tempRes = res
        for((k,v) <- temp){
          if(tree.length == 1 && k == tree.head){
            tempRes = tempRes ::: List(v)
          }else if(k == tree.head){
            tempRes = tempRes ::: List(_parseJsonUrls(v, tree.tail, res))
          }
        }
        tempRes


      case _ if tree.isEmpty => println("reached bottom of the tree => ")
        jsonObj

      case _ => println("Matching nothing")
        res
    }
    _parseJsonUrls(JSON.parseFull(jsonStr), tree, Nil)
  }

  val s = """[{"_class":"lecture","asset": {"_class" : "asset", "download_urls":{"Video": []}}}]"""
  val res = parseJsonUrls(s, List("asset", "download_urls"))
  println("result => "+ res)
}
