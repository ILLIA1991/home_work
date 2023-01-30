package org.example.homework_2.task_3;

public class Addition {
    public static void main(String[] args) {
        int j = 0; // j - это сумма всех чисел, назови переменную sum
        for (int i = 0; i <= 8; i++) {
            j += 1 << i;
            System.out.println(j);
        }
    }

}
