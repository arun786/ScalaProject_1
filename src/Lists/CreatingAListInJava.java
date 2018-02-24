package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Adwiti on 2/24/2018.
 */
public class CreatingAListInJava {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30);
        numbers.forEach(System.out::println);

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.forEach((System.out::println));
    }
}
