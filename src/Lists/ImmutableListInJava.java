package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Adwiti on 3/2/2018.
 */
public class ImmutableListInJava {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(100);
        lst.add(200);
        lst.add(100);
        List<Integer> copyOfList = Collections.unmodifiableList(lst);

        copyOfList.add(300);
        System.out.println(lst);

    }
}
