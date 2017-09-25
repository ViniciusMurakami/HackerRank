package main.scala

object DictionariesMaps {
  def main(args: Array[String]){
   /*val n = scala.io.StdIn.readInt()
    var dictionary = scala.collection.mutable.Map[String, Int]()
    var keep:Boolean = true
    for(round <- 0 to n-1){
      var name_phone = scala.io.StdIn.readLine().split(" ")
      dictionary.put(name_phone(0),name_phone(1).toInt)
    }

    while(keep){
      var key = scala.io.StdIn.readLine()
      keep = key.nonEmpty && key != null
      if(dictionary.contains(key)){
        println(s"${key}=${dictionary(key)}")
      } else {
        println("Not found")
      }
    }*/
  val inputs: Iterator[String] = io.Source.stdin.getLines
    val n = inputs.next.toInt
    val map = makeMap(inputs.take(n))
    for (ln <- inputs) println(get(map)(ln))
  }
  def makeMap(n: Iterator[String]):Map[String, String] = {
    n.foldLeft(Map[String,String]())((acc, item)=> {
      val temp = item.split(" ")
      acc ++ Map(temp(0) -> temp(1))
    })
  }
  def get(map: Map[String, String])(key: String): String = {
    if (map.isDefinedAt(key)) {
      s"${key}=${map(key)}"
    } else {
      "Not found"
    }
  }
}
