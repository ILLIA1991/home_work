package org.example_1.hw_26.Task_1;

import java.util.stream.Stream;

public class StringFilter {
    public static void main(String[] args) {

        Stream<String> cityList = Stream.of("Иван", "Григорий", "Марина", "Владимир", "Ира", "Надя");
        cityList.filter(s -> s.length() == 6).forEach(System.out::println);
    }
}
