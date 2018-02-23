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
