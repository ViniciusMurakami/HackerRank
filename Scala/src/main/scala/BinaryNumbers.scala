package main.scala

object BinaryNumbers {
  def main(args: Array[String]){
    val n = scala.io.StdIn.readInt()
    val binary = Integer.toString(n,2)
    var set = 0
    var max = 0
    for(i <- 0 to binary.length -1){
      if(binary.charAt(i) == '1'){
        set = set + 1
        if(max < set){
          max = set
        }
      } else {
        set = 0
      }

    }
    println(max)
  }
}
