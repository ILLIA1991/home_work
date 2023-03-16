package org.example_1.hw_14.task_3;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* Task 3
        В классе Application создайте строки: '2023-17-01', '23-2022-01', '15-07-2022'.
        Распарсите эти строки в объекты LocalDate, используя DateTime formatter.
        Каждую полученную дату выведите в консоль в нескольких форматах:
        01-Mar-2022, Mar-01-2022, 2022-01-Mar, 01-March-2022
        Создайте объект LocalDateTime и выведите его в консоль в каком-то нетипичном формате на ваше усмотрение.
*/
public class Application {
    public static void main(String[] args) {
        String data = "2023-17-01";
        String data1 = "23-2022-01";
        String data2 = "15-07-2022";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyy");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("MMM-dd-yyy");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyy-dd-MMM");
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd-MMMM-yyy");

        LocalDate date = LocalDate.parse("2023-17-01", DateTimeFormatter.ofPattern("yyy-dd-MM"));
        LocalDate date1 = LocalDate.parse("23-2022-01", DateTimeFormatter.ofPattern("dd-yyy-MM"));
        LocalDate date2 = LocalDate.parse("15-07-2022", DateTimeFormatter.ofPattern("dd-MM-yyy"));

        System.out.println("");
        System.out.println(dateTimeFormatter.format(date) + "|" + dateTimeFormatter1.format(date) + "|" + dateTimeFormatter2.format(date) + "|" + dateTimeFormatter3.format(date));
        System.out.println("");
        System.out.println(dateTimeFormatter.format(date1) + "|" + dateTimeFormatter1.format(date1) + "|" + dateTimeFormatter2.format(date1) + "|" + dateTimeFormatter3.format(date1));
        System.out.println("");
        System.out.println(dateTimeFormatter.format(date2) + "|" + dateTimeFormatter1.format(date2) + "|" + dateTimeFormatter2.format(date2) + "|" + dateTimeFormatter3.format(date2));

        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofPattern("MMMM d, yyyy HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("");
        System.out.println(dateTimeFormatter4.format(dateTime));
    }
}
