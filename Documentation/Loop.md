# WhileLoop

## Scala

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


## Java

    package Loop;
    
    /**
     * Created by Adwiti on 2/22/2018.
     */
    public class WhileLoopInJava {
    
        public static void main(String[] args) {
            whileLoop(10);
        }
    
        public static void whileLoop(int a) {
            int index = 0;
    
            while (index < a) {
                System.out.println(index);
                index++;
            }
        }
    
    
    }

# For Loop

## Scala
    
    package Loop
    
    /**
      * Created by Adwiti on 2/22/2018.
      */
    object ForLoopInScala {
    
      def main(args : Array[String]): Unit ={
        for(arg <- args){
          println(arg)
        }
      }
    }

## Java

    package Loop;
    
    /**
     * Created by Adwiti on 2/22/2018.
     */
    public class ForLoopInJava {
        public static void main(String[] args) {
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }

[Back to ReadMe](https://github.com/arun786/ScalaProject_1)