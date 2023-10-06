package org.example_1.hw_3;
// Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
//день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
//суммарный путь пробежит спортсмен за 7 дней?
public class Sportsmen {
    public static void main(String[] args) {
        float today, trening1;
        int day;
        trening1 = today = 10;

        for (day = 2; day <= 7; day++) {
            today  *= 1.1;
            trening1 += today;
            System.out.println("Пробежал" + " " + today);
        }
        System.out.println("Общее расстояние" + " " + trening1);

    }
}
