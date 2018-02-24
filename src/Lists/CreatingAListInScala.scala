package Lists

/**
  * Created by Adwiti on 2/24/2018.
  */
object CreatingAListInScala {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3)
    for (number <- numbers) {
      println(number)
    }

    val number = List.apply(10, 20, 30);
    for (n <- number) {
      println(n)
    }
  }
}
