package org.example_1.hw_25.Task_1;

import java.util.function.Function;

public class FunctionConverting {

    public static void main(String[] args) {
        // здесь вызывать String.valueOf(x) не нужно, достаточно было бы x -> x + "dollars"
        Function<Integer, String> converting = x -> String.valueOf(x) + "dollars";
        System.out.println(converting.apply(5));
    }
}
