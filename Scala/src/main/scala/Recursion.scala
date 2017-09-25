package main.scala

object Recursion {
  def factorial(n: Int): Int =  {
    if(n == 1){
      n
    } else {
      n * factorial(n - 1)
    }
  }
  def main(args: Array[String]){
    val sc = scala.io.StdIn.readInt()
    val result = factorial(sc);
    println(result)
  }
}
