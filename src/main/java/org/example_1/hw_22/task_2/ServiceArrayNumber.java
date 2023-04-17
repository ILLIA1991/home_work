package org.example_1.hw_22.task_2;

public class ServiceArrayNumber {

    public static void main(String[] args) {

        Integer[] integers = new Integer[10];
        Long[] longs = new Long[10];
        Double[] doubles = new Double[10];

        NumberStorage<Integer> integerNumberStorage = new NumberStorage<>(integers);
        NumberStorage<Long> longNumberStorage = new NumberStorage<>(longs);
        NumberStorage<Double> doubleNumberStorage = new NumberStorage<>(doubles);
    }
}
