package main.scala

import java.util.Scanner


object TwoDimArrays {
  def main(args: Array[String]){
    var twodimarray = Array.ofDim[Int](6,6)
    var scanner = new Scanner(System.in)
    for(i <- 0 to 6-1){
      for(j <- 0 to 6-1){
        twodimarray(i)(j) = scanner.nextInt()//scala.io.StdIn.readLine().split(" ").##
      }
    }

    var hourglass = 0
    var max = Integer.MIN_VALUE

    for(k <- 0 to 4-1){
      for(l <- 0 to 4-1){

        hourglass = twodimarray(k)(l) + twodimarray(k)(l + 1) + twodimarray(k)(l + 2) + twodimarray(k + 1)(l + 1) + twodimarray(k + 2)(l) + twodimarray(k + 2)(l + 1) + twodimarray(k + 2)(l + 2)

        if(hourglass > max){
          max = hourglass
        }
      }
    }
   println(max)
  }
}
