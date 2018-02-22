package Loop

/**
  * Created by Adwiti on 2/22/2018.
  */
object ForLoopInScala {

  def main(args: Array[String]): Unit = {
    for (arg <- args) {
      println(arg)
    }

    /**
      * Concise forms of foreach
      */
    args.foreach(arg => println(arg))

    args.foreach(println)

    args foreach println
  }
}
