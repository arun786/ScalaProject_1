# Creation of Array

## Scala

    package Arrays
    
    /**
      * Created by Adwiti on 2/23/2018.
      */
    object CreateArraysInScala {
    
      def main(args: Array[String]): Unit = {
        //first way of creating an array in scala
    
        val users = new Array[String](3)
        users(0) = "arun"
        users(1) = "adwiti"
        users(2) = "pushpa"
    
        for (user <- users) {
          print(user + ",")
        }
    
        println()
        //Second way of creating an array
        val newusers = Array("arun", "adwiti", "pushpa")
        for (newuser <- newusers) {
          print(newuser + ",")
        }
        println()
    
        //Third way of creating an array
        val newUsr = Array(1, 2, 3)
        for (newUsr <- newUsr) {
          print(newUsr + ",")
        }
      }
    
    }


## Java

    package Arrays;
    
    /**
     * Created by Adwiti on 2/24/2018.
     */
    public class CreateArrayInJava {
        public static void main(String[] args) {
            String[] users = new String[3];
            users[0] = "arun";
            users[1] = "adwiti";
            users[2] = "pushpa";
    
            for (int i = 0; i < users.length; i++) {
                System.out.println(users[i]);
            }
        }
    }
[Back to ReadMe](https://github.com/arun786/ScalaProject_1)