package org.example_1.hw_14.task_4;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Person {

    private final String name;
    private final  String surname;
    private final  LocalDate birthday;
    private final DayOfWeek loveday;

    public Person(String name, String surname, LocalDate birthday, DayOfWeek loveday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.loveday = loveday;
    }

}
