package Function

/**
  * Created by Adwiti on 2/22/2018.
  */
object FunctionsInScala {

  def main(args: Array[String]): Unit = {
    val maxValue = max(10, 20)
    println(maxValue)

    val incrementValue = increment(10)
    println(incrementValue)

    val greets = greet()
    println(greets)
  }

  def max(a: Int, b: Int): Int = {
    if (a > b) a else b
  }

  def increment(x: Int): Int = x + 1

  def greet() = "hello World"
}
