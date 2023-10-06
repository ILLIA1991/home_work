package org.example_1.hw_23.Task_1;

public class Application {
    public static void main(String[] args) {
        MyValidatorAnnotation myValidatorAnnotation = new MyValidatorAnnotation();

        // одного сценария для проверки недостаточно. сейчас валидатор работает некорректно, но этот кейс не показывает проблем
        AccountInformation accountInformation = new AccountInformation("Ivan", "ivanov", "ivanov@mail.ru", 123456789);

        myValidatorAnnotation.validate(accountInformation);
        System.out.println(accountInformation);

    }
}
