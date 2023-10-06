package trenning.trening_lection_6.task_1;

import java.util.Arrays;

public class UserExample {

    public static void main(String[] args) {

        UserClass userClass = new UserClass();

        System.out.println(userClass);

        UserClass userClass1 = new UserClass("Illia", 32);
        UserClass userClass2 = new UserClass("Aleksandra", 34);
        UserClass userClass3 = new UserClass("Maksim", 19);

        UserClass[] userClassArray = new UserClass[] {userClass1, userClass2, userClass3};

        System.out.println(Arrays.toString(userClassArray));

        String text = UserClass.text;

        System.out.println(text);

    }
}
