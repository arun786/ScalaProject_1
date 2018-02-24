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
