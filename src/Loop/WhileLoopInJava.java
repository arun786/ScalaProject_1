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
