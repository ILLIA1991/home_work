package org.example_1.hw_14.task_2;
/* Task 2
Создайте свое непроверяемое исключение.
Создайте класс Printer с тремя методами: turnOn(), print(String document), turnOff().
Метод print должен рандомно либо бросать ваше непроверяемое исключение, либо выводить в консоль строку.
В классе Application создайте принтер, включите его и распечатайте любую строку. Обработайте ситуацию с ошибкой с
помощью блока finally, в котором выключите принтер. Блок catch в этом задании не используйте.*/

import org.apache.commons.lang3.RandomUtils;

public class Printer {
    public void turnOn() {
        System.out.println("Включаем принтер");

    }

    public static void print(String document)  {
        if (RandomUtils.nextBoolean()) {
            throw new PrinterUncheckedException("Пробуем распечатать документ");
        }
        System.out.println(document);
    }

    public  void turnOff() {
        System.out.println("Выключаем принтер");
    }


}
