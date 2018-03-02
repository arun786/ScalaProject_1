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