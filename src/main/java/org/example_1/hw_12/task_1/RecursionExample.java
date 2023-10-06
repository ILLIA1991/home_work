package org.example_1.hw_12.task_1;
/* Task 1
Написать класс, который вычисляет сумму чисел от 0 до заданного числа.
В классе должно быть два метода: вычисление через цикл и рекурсивное вычисление.
В другом классе Application создать объект класса-калькулятора и вызвать оба метода.
Сравнить результат.
 */

public class RecursionExample {
    public static void main(String[] args) {
        int sum = sumEnd(20);
        System.out.println("The End:" + " " + sum);
        int recurs = sumRecursive(20);
        System.out.println("Recursize:" + " " + recurs);
    }
    public static int sumRecursive (int go) {
        if(go > 0) {
            return go + sumRecursive(go - 1) ;
        } else {
            return 0;
        }
    }
    public static int sumEnd(int go) {
        int sum = 0;
        for (int i = 0; i <= go; i++) {
            sum += i ;
        }
        return sum;
    }
}
