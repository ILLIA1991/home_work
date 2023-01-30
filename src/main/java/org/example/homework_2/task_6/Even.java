package org.example.homework_2.task_6;

public class Even {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) { // от 2 до 100 включительно в условии задачи, получилось на 1 итерацию больше
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

