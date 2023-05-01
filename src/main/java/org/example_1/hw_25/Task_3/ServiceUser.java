package org.example_1.hw_25.Task_3;

public class ServiceUser {
    public static void main(String[] args) {
        UserName userName = User::new;
        User user = userName.create("Илья");
        System.out.println(user);
    }


}
interface UserName {
    User create(String name);
}