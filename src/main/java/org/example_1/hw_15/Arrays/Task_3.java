package org.example_1.hw_15.Arrays;
/*Task 3
        Создайте массив чисел {66, 77,90,3,15,33,45,0,-20}
        Выведите в консоль результат деления на 3: 66 поделить на 3 = 22
        Выведите произведение всех чисел
*/

public class Task_3 {
    public static void main(String[] args) throws Exception {
        int[] Arrays = new int[]{66, 77, 90, 3, 15, 33, 45, 0, -20};
        int multiplication = 1;


        for (int i = 0; i < Arrays.length; i++) {
            if (Arrays[i] > 0) {
                Arrays[i] = Arrays[i] / 3;
            }
            System.out.printf(" %d podelit na 3 = %d", i, Arrays[i]);
            System.out.println();

        }
        for (int array : Arrays) {
            multiplication *= array;

        }
        System.out.println(multiplication);

    }
}
