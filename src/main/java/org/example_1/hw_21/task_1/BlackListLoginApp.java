package org.example_1.hw_21.task_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BlackListLoginApp {

    public static final String EXIT = "exit";
    public static final String SKIP = "skip";

    public static void main(String[] args) {

        Map<String, String> namesWithPasswords = new HashMap();
        BlackListService blackListService = new BlackListService();

        namesWithPasswords.put("Pavel", "pass1");
        namesWithPasswords.put("Anna", "pass2");
        namesWithPasswords.put("Illia", "pass3");

        Scanner scanner = new Scanner(System.in);

        // exit
        while (true) {
            System.out.println("Enter your username: ");
            String username = scanner.nextLine();
            if (username.equalsIgnoreCase(EXIT)) {
                break;
            }
            if (blackListService.isBanned(username)) {
                System.out.println("Такой пользователь уже забанен: " + username);
                continue;
            }
            if (namesWithPasswords.containsKey(username)) {

                System.out.println("Please enter your password..");
                String password = scanner.nextLine();

                String passwordFromDB = namesWithPasswords.get(username);

                if (password.equals(passwordFromDB)) {
                    System.out.println("Hello, " + username);
                    blackListService.resetFailedLoginCount(username);
                } else {
                    System.out.println("Password incorrect! Try again!");
                    blackListService.increaseFailedLoginCounter(username);
                    continue;
                }
            } else {
                System.out.println("Not found: " + username);
                String newName = scanner.nextLine();
                if (username.equals(namesWithPasswords))  {
                    System.out.println("Есть такой пользователь:" + username);
                }  else  {
                    System.out.println("Такого пользователя нет!");
                }
                // нужна проверка на то,есть ли такое имя в системе
                if (!newName.equalsIgnoreCase(SKIP)) {
                    System.out.println("Enter your new password");
                    String newPassword = scanner.nextLine();
                    namesWithPasswords.put(newName, newPassword);
                    System.out.println("Hello, " + newName + " you are registered!");
                } else {
                    continue;
                }
            }
        }

    }
}
