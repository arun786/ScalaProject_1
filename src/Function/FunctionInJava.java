package Function;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by Adwiti on 2/22/2018.
 */
public class FunctionInJava {
    public static void main(String[] args) {
        int maxValue = max(10, 20);
        System.out.println(maxValue);

        int incrementValue = increment(10);
        System.out.println(incrementValue);

        Function<Integer, Integer> function = (a) -> a + 1;
        incrementValue = function.apply(10);
        System.out.println(incrementValue);

        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int increment(int x) {
        return ++x;
    }
}
