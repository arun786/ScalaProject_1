# Exercises

## 1. Reverse a String 

### Scala

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

### Java

    package Exercise1;
    
    /**
     * Created by Adwiti on 2/23/2018.
     */
    public class ReverseStringInALineInJava {
    
        public static void main(String[] args) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(new StringBuilder(args[i]).reverse());
            }
        }
    }

## 2. Change to upper case

### Scala

    package Exercise1
    
    /**
      * Created by Adwiti on 2/23/2018.
      */
    object ChangeStringsInALineUpperCaseInScala {
    
      def main(args: Array[String]): Unit = {
        args.foreach(arg => println(arg.toUpperCase))
      }
    }

### Java

    package Exercise1;
    
    /**
     * Created by Adwiti on 2/23/2018.
     */
    public class ChangeStringsInALineUpperCaseInJava {
    
        public static void main(String[] args) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i].toUpperCase());
            }
        }
    }
