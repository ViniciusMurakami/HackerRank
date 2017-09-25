package main.scala

object Arrays {
  def main(args: Array[String]) {
 /*   var n = scala.io.StdIn.readInt()
    var arr = new Array[String](n)

   for(arr_i <- 0 to n-1) {
      arr(arr_i) = scala.io.StdIn.readLine()
    }
    for(x <- n-1 to 0 by - 1 ){
      print(s"${arr(x)} ")
    }*/
   val n = scala.io.StdIn.readInt()
   val list = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    for(arr_i <- list.length - 1 to 0 by -1){
      print(s"${list(arr_i)} ")
    }

  }
}
