package org.example_1.hw_25.Task_3;

// уточнение по именованию - лучше именовать по схеме ...Service: UserService, OrderService
public class ServiceUser {
    public static void main(String[] args) {
        UserName userName = User::new;
        User user = userName.create("Илья");
        System.out.println(user);
    }


}

// вынесите этот интерфейс в отдельный файл и пометьте его нужной аннотацией
interface UserName {
    User create(String name);
}
