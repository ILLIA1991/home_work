package org.example_1.hw_27.Task_2;

/*
Task 2
Напишите сервис, который будет собирать статистику об абонентах:
-  метод должен принять список абонентов, вычислять их возраст, и вычислять IntSummaryStatistics. Метод дожен вернуть строку-отчет: “Количество абонентов - хх. Самый юный - хх лет, самый возрастной - хх лет, средний возраст - хх лет
-  метод должен принимать список абонентов, отбирать только премиальных клиентов, вычислять, сколько уже длится их контракт и собирать статистику. Метод должен возвращать строку - отчет: Количесвто абонентов - жж, самый долгий контракт - хх, средний срок контрактв - хх

 */

import org.example_1.hw_27.Task_1.Abonent;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StatisticsAbonent {
    public static void main(String[] args) {
        List<Abonent> abonents = new ArrayList<>(List.of(
                new Abonent("Illia", "Belikau", "1234", LocalDate.of(1991, 02, 03), LocalDate.of(2018, 05, 05), false, "Minsk"),
                new Abonent("Dima", "Shtaket", "1234", LocalDate.of(1995, 11, 9), LocalDate.of(2020, 05, 05), true, "Wroclaw"),
                new Abonent("Maria", "Kurochkina", "1234", LocalDate.of(2000, 8, 23), LocalDate.of(2023, 05, 05), true, "Krakow"),
                new Abonent("Artem", "Volia", "1234", LocalDate.of(1985, 4, 25), LocalDate.of(2021, 05, 05), true, "Warshawa"),
                new Abonent("Jack", "Jakovich", "1234", LocalDate.of(1989, 2, 20), LocalDate.of(2023, 05, 05), false, "Olesnica"),
                new Abonent("Sveta", "Svetovich", "1234", LocalDate.of(2001, 12, 5), LocalDate.of(2022, 05, 05), false, "Wroclaw")));

        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(1991, 2, 3),
                LocalDate.of(1995, 11, 9),
                LocalDate.of(2000, 8, 23),
                LocalDate.of(1985, 4, 25),
                LocalDate.of(1989, 2, 20),
                LocalDate.of(2001, 12, 5));

        // тут надо пройти по списку абонентов и взять даты у них
        IntSummaryStatistics stats = dates.stream()
                .mapToInt(date -> Period.between(date, LocalDate.now()).getYears()).summaryStatistics();

        // и нужно вынести в метод, который вернет строку со всем этим
        System.out.printf("Number of subscribers: %d%n", stats.getCount());
        System.out.printf("Max age: %d%n", stats.getMax());
        System.out.printf("Min age: %d%n", stats.getMin());
        System.out.printf("Average age: %.2f%n", stats.getAverage());
        System.out.println();


        List<LocalDate> contractDates = Arrays.asList(

                LocalDate.of(2020, 5, 5),
                LocalDate.of(2023, 5, 5),
                LocalDate.of(2021, 5, 5));


        // см комент выше
        IntSummaryStatistics stats1 = contractDates.stream()
                .mapToInt(localDate -> Period.between(localDate, LocalDate.now()).getYears()).summaryStatistics();

        System.out.printf("Number of subscribers VIP: %d%n", stats1.getCount());
        System.out.printf("Max contract: %d%n", stats1.getMax());
        System.out.printf("Average contract: %.2f%n", stats1.getAverage());


    }
}
