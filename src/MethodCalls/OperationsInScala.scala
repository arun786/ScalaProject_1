package MethodCalls

/**
  * Created by Adwiti on 2/23/2018.
  */
object OperationsInScala {
  def main(args: Array[String]): Unit = {

    val doubleSum = 4.0 + 3.0
    println(doubleSum)

    val doubleSumMethod = 4.0.+(3.0)
    println(doubleSumMethod)

    val greeting = "hello"
    println(greeting.charAt(1))

    println(greeting charAt 1)
  }
}
