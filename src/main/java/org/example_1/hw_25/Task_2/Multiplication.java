package org.example_1.hw_25.Task_2;

import java.util.function.BinaryOperator;

public class Multiplication {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiplication = (a, b ) -> a * b;
        System.out.println(multiplication.apply(4,8));
    }
}
