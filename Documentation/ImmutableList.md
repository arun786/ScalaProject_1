# Immutable List

## Scala

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


## Java

    package Lists;
    
    import org.junit.Test;
    import org.junit.runner.RunWith;
    import org.junit.runners.JUnit4;
    
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;
    
    /**
     * Created by Adwiti on 3/2/2018.
     */
    @RunWith(JUnit4.class)
    public class ImmutableListInJavaTest {
    
        @Test(expected = UnsupportedOperationException.class)
        public void immutableListInJava() {
            List<Integer> lst = new ArrayList<>();
            lst.add(100);
            lst.add(200);
            lst.add(300);
            List<Integer> immutableList = Collections.unmodifiableList(lst);
            immutableList.add(400);
        }
    }
    
[Back to ReadMe](https://github.com/arun786/ScalaProject_1)