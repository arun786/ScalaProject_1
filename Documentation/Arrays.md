# Arrays 

## Scala

    package Arrays
    
    /**
      * Created by Adwiti on 2/23/2018.
      */
    object ArraysInScala {
      def main(args: Array[String]): Unit = {
        val gs = new Array[String](3)
        gs(0) = "Hello"
        gs(1) = ","
        gs(2) = "World"
    
        for (i <- 0 to 2) {
          println(gs(i))
        }
      }
    }


## Java

    package Arrays;
    
    /**
     * Created by Adwiti on 2/23/2018.
     */
    public class ArraysInJava {
        public static void main(String[] args) {
            String[] gs = new String[3];
            gs[0] = "Hello";
            gs[1] = ",";
            gs[2] = "World";
    
            for (int i = 0; i < gs.length; i++) {
                System.out.println(gs[i]);
            }
        }
    }
