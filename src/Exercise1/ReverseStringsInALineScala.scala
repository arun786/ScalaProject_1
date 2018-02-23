package Exercise1

/**
  * Created by Adwiti on 2/23/2018.
  */
object ReverseStringsInALineScala {

  def main(args: Array[String]): Unit = {
    var index = 0
    while (index < args.length) {
      println(args(index).reverse)
      index += 1
    }
  }
}
