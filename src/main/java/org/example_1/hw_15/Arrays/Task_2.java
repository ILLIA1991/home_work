package org.example_1.hw_15.Arrays;
/*
Task 2
        Создайте массив чисел {4, 18,9,7,15,33,32,0,-20}
        Выведите в консоль только НЕЧЕТНЫЕ числа из этого массива.
        Выведите сумму всех ЧЕТНЫХ чисел
*/

public class Task_2 {
    public static void main(String[] args) {

        int[] Arrays = new int[] {4, 18, 9, 7, 15, 33, 32, 0, -20};
        int sum = 0;
        int element = 0;
        for (int i = 0; i < Arrays.length; i++) {
            if (Arrays[i] % 2 != 0) {
                element++;
                sum += Arrays[i];
                System.out.print(Arrays[i] + " ");
            }



        }
        System.out.println("Всего нечетных элементов:" + element);
        System.out.println("Их сумма равна:" + sum);

    }
}
