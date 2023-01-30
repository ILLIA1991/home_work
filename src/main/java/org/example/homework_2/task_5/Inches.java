package org.example.homework_2.task_5;

public class Inches {
    public static void main(String[] args) {
        double a = 2.54; // a - это коэффициент перевода, так и назови переменную
        int b; // используй названия переменных соот-но тому, что в них содержится. Если не знаешь перевод, то придумай на русском и воспользуйся гуглом
        int i = 1; // туда же, i - название мы можем использовать только в цикле как индекс, в остальных случаях стоит придумать что-то говорящее
        System.out.println("Size of an inch in centimeters");
        for (b = 1; b <= 20; b++) {
            System.out.print(i++ + " = ");
            System.out.println(b * a);
        }
    }
}
