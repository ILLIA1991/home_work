package org.example_1.hw_3;

//Вычислить: 1+2+4+8+...+256
// 8 << 3
public class Calculation {
    public static void main(String[] args)  {
        int a = 0;

        for (int i = 1; i <= 8 ; i++) {
            a += 1 << i;

        }
        System.out.println(a);
    }


}
