package org.example.homework_2.task_1;

// название класса с большой буквы
public class Trening { // Trening - в названиях классов стоит использовать только англ слова
    public static void main(String[] args) {
        int km = 10;
        System.out.println(km);
        for (int j = 1; j < 7; j++) {
            km += km * 0.1;
            System.out.println(km);
        }
        // ты вывел на экран дистанчию за каждый день, осталось посчитать общую за 7 дней
    }
}
