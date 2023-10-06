package org.example_1.hw_3;

public class Inch2 {
    public static void main(String[] args) {
        double S = 2.54;
        int n = 20;

        while (n <= 20) {
            S += 2.54;
            n++;
        }

        System.out.println(S);
    }
}
