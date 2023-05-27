package org.example_1.hw_27.task_3;

/*
Task 3
Напишите сервис с методами:
-  метод принимает список абонентов, оставляет только не vip и возвращает Map<String, Abonent> - ключ - номер договора, значение - абонент
-  метод принимает список абонентов и группирует их по городам
 */

import org.example_1.hw_27.Task_1.Abonent;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

public class Application {
    public static void main(String[] args) {
        ServiceAbonent serviceAbonent = new ServiceAbonent();
        List<Abonent>  abonents = new ArrayList<>(List.of(
                new Abonent("Illia", "Belikau", "1234", LocalDate.of(1991, 02, 03), LocalDate.of(2018, 05, 05), false, "Minsk"),
                new Abonent("Dima", "Shtaket", "1235", LocalDate.of(1995, 11, 9), LocalDate.of(2020, 05, 05), true, "Wroclaw"),
                new Abonent("Maria", "Kurochkina", "1236", LocalDate.of(2000, 8, 23), LocalDate.of(2023, 05, 05), true, "Krakow"),
                new Abonent("Artem", "Volia", "1237", LocalDate.of(1985, 4, 25), LocalDate.of(2021, 05, 05), true, "Warshawa"),
                new Abonent("Jack", "Jakovich", "1238", LocalDate.of(1989, 2, 20), LocalDate.of(2023, 05, 05), false, "Warshawa"),
                new Abonent("Sveta", "Svetovich", "1239", LocalDate.of(2001, 12, 5), LocalDate.of(2022, 05, 05), false, "Wroclaw")));

        Map<String, Abonent> noVip = serviceAbonent.mapNonVipAbonentsByContract(abonents);
        System.out.println(noVip);
        System.out.println();

        Map<String, List<Abonent>> groupingCity = serviceAbonent.groupByCity(abonents);
        System.out.println(groupingCity);







    }
}
