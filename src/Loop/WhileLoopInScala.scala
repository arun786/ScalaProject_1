package Loop

/**
  * Created by Adwiti on 2/22/2018.
  */
object WhileLoopInScala {

  def main(args: Array[String]): Unit = {
    runAwhileLoop(10)
  }

  def runAwhileLoop(a: Int): Unit = {
    var index = 0
    while (index < a) {
      println(index)
      index += 1
    }
  }
}
