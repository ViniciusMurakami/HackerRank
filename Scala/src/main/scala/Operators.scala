package main.scala

/**
  * Created by vmurakami on 19/07/17.
  */
object Operators {
  def main(args: Array[String]) {
    val mealCost = scala.io.StdIn.readDouble()
    val tipPercent = scala.io.StdIn.readInt()
    val taxPercent = scala.io.StdIn.readInt()
    val tip = mealCost * tipPercent / 100
    val tax = mealCost * taxPercent / 100
    val calculation = mealCost + tax + tip
    val totalCost = math.round(calculation)

    println(s"The total meal cost is $totalCost dollars.")
  }
}
