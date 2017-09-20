package main.scala

object LetsReview {
  def main(args: Array[String]) {
  val qty_word:Int = scala.io.StdIn.readInt()
    while(qty_word > 0){
      var word:String = scala.io.StdIn.readLine()
      var even = new StringBuilder()
      var odd = new StringBuilder()
      for (counter <- 0 to word.length - 1){
        if(counter % 2 == 0 || counter == 0){
          even.append(word.charAt(counter))
        } else {
          odd.append(word.charAt(counter))
        }

      }
      println(s"$even $odd")
      }
    }
}
