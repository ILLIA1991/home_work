package org.example_1.hw_13.task_4;

public class NumbersArray {
    public static void main(String[] args) {
        int[] myChponks = new int[]{4, 1, -10, 15, 25, 88, 90, 133, 20, 0};
        int sum = 0;
        for (int i = 0; i < myChponks.length; i++) {
            try {
                System.out.printf(String.valueOf(0 / (myChponks[i] - 4)));
            } catch (ArithmeticException exception) {
                System.out.println("При обработке элемента (4) произошла ошибка:" + exception.getMessage());
                sum += myChponks[i];
                System.out.println(sum);
            }


        }

    }
}
