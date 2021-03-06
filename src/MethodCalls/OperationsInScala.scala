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

    val gc = new Array[String](3)
    gc(0) = "Hello"
    gc(1) = " , "
    gc(2) = "World"

    for (gc <- gc) {
      println(gc)
    }

    //retrieving data from array can be done
    println(gc(1))
    //or
    println(gc.apply(1))

    //to assign value to a particular index, we can
    gc.update(1, "crazy")

    for (gc <- gc) {
      println(gc)
    }
  }
}
