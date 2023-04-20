package org.example_1.hw_23.Task_1;

import java.util.concurrent.locks.StampedLock;

public class Application {
    public static void main(String[] args) {
        MyValidatorAnnotation myValidatorAnnotation = new MyValidatorAnnotation();

        AccountInformation accountInformation = new AccountInformation("Ivan", "ivanov", "ivanov@mail.ru", 123456789);

        myValidatorAnnotation.validate(accountInformation);
        System.out.println(accountInformation);

    }
}
