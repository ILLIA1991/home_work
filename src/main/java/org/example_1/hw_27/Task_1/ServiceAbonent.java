package org.example_1.hw_27.Task_1;
/*
Task 1
Напишите сервис с несколькими методами для работы со списком абонентов:

-  метод должен принять список абонентов и город, а вернуть true есть ли в этом городе хоть один вип-абонент (иначе вернуть false) (anyMatch)
-  метод должен принять список обонентов и дату, а вернуть true если все аюоненты в списке подключились до этой даты (allMatch)
-  метод должен принять список абонентов и город, и вернуть любого абонента из этого города, а если из этого города абонентов нет - выбросить исключение (findAny, optional
 */

import trenning.lection_16.LocalDateFinalExample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

// все три таски надо разделить на два класса: сервис + application.
public class ServiceAbonent {
    public static void main(String[] args) {
        List<Abonent> abonents = new ArrayList<>(List.of(
                new Abonent("Illia", "Belikau", "1234", LocalDate.of(1991, 02, 03), LocalDate.of(2023, 05, 05), false, "Minsk"),
                new Abonent("Dima", "Shtaket", "1234", LocalDate.of(1995, 11, 9), LocalDate.of(2023, 05, 05), true, "Wroclaw"),
                new Abonent("Maria", "Kurochkina", "1234", LocalDate.of(2000, 8, 23), LocalDate.of(2023, 05, 05), false, "Krakow"),
                new Abonent("Artem", "Volia", "1234", LocalDate.of(1985, 4, 25), LocalDate.of(2023, 05, 05), false, "Warshawa"),
                new Abonent("Jack", "Jakovich", "1234", LocalDate.of(1989, 2, 20), LocalDate.of(2023, 05, 05), false, "Olesnica"),
                new Abonent("Sveta", "Svetovich", "1234", LocalDate.of(2001, 12, 5), LocalDate.of(2023, 05, 05), false, "Wroclaw")));

        LocalDate date =  LocalDate.of(2023,05,06 );

        // тут суть правильна, но вынеси плиз в private метод
        boolean any = abonents.stream()
                .anyMatch(Abonent::getVip);
        System.out.println(any);


        // тут суть правильна, но вынеси плиз в private метод
        boolean all = abonents.stream()
                .allMatch(abonent -> abonent.getContractDate().isBefore(date));
        System.out.println(all);

        // вынеси плиз в private метод, который примет список и город
        Optional<Abonent> abonentFromCity = abonents.stream()
                .filter(abonent1 -> abonent1.getCity().equals("Wroclaw"))
                .findAny();

        // весь код далее можно заменить одной этой строкой + вынеси плиз в private метод
        // Abonent abonent = abonentFromCity.orElseThrow(() -> new IllegalArgumentException("Это не наш клиент"));
        if (abonentFromCity.isPresent()) {
            System.out.println(abonentFromCity.get());
        } else {
            Abonent abonent = abonentFromCity.orElseThrow(() -> new IllegalArgumentException("Это не наш клиент"));
            System.out.println(abonent);
        }







    }
}
