package Lists

/**
  * Created by Adwiti on 2/28/2018.
  */
object ImmutableListInScala {

  def main(args: Array[String]): Unit = {
    //To initialize an Immutable List
    val list1: List[Integer] = List(10, 20, 30);
    println(s"$list1")

    //To access an element at a specific index
    println(s"${list1(0)}")
    println(s"${list1(1)}")
    println(s"${list1(2)}")

  }
}
