package org.example_1.hw_3;
//Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.

public class AB {
    public static void main(String[] args) {
        int A = 5;
        int B = 10;
        int AB = 0;

        for (int i = 1; i <= B; i++) {
            AB += A;
        }
        System.out.println(AB);
    }
}

