package main.scala

/**
  * Created by vmurakami on 19/07/17.
  */
object ConditionalStatements {
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    var ans=""

    if ((n % 2 == 1) || ((n % 2 == 0) && n >= 6 && n <= 20)) ans = "Weird"
    else ans = "Not Weird"

  println(s"$ans")
  }
}

