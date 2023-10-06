package org.example_1.hw_14.task_2;

import org.apache.commons.lang3.RandomUtils;

public class Application {
    private static String document = "Документы на регистрацию автомобиля";

    public static void main(String[] args) throws PrinterUncheckedException {
        Printer printer = new Printer();
        printer.turnOn();
        System.out.println("Принтер включен");

        try {
            Printer.print(document);
        } finally {
            System.out.println("Выключаем принтер");
            printer.turnOff();
        }
    }

}
