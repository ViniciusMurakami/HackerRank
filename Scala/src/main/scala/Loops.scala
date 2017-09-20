package main.scala

object Loops {
  def main(args: Array[String]) {
    var n = scala.io.StdIn.readInt()
    var count:Int = 1
    while(count <= 10){
      println(s"$n x $count = ${n * count}")
      count = count + 1
    }
  }
}
