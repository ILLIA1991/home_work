package org.example_1.hw_22.task_2;

public class NumberStorage <T extends Number> {

    private final T[] numbers;

    public NumberStorage(T[] numbers) {
        this.numbers = numbers;
    }

    public T[] getNumbers() {
        return numbers;
    }


}
