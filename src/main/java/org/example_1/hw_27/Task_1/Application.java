package org.example_1.hw_27.Task_1;
/*
Task 1
Напишите сервис с несколькими методами для работы со списком абонентов:

-  метод должен принять список абонентов и город, а вернуть true есть ли в этом городе хоть один вип-абонент (иначе вернуть false) (anyMatch)
-  метод должен принять список обонентов и дату, а вернуть true если все аюоненты в списке подключились до этой даты (allMatch)
-  метод должен принять список абонентов и город, и вернуть любого абонента из этого города, а если из этого города абонентов нет - выбросить исключение (findAny, optional
 */

import java.time.LocalDate;
import java.util.*;

// все три таски надо разделить на два класса: сервис + application.
public class Application {
    public static void main(String[] args) {
        ServiceAbonent serviceAbonent = new ServiceAbonent();
        List<Abonent> abonents = new ArrayList<>(List.of(
                new Abonent("Illia", "Belikau", "1234", LocalDate.of(1991, 02, 03), LocalDate.of(2023, 05, 05), false, "Minsk"),
                new Abonent("Dima", "Shtaket", "1234", LocalDate.of(1995, 11, 9), LocalDate.of(2023, 05, 05), false, "Wroclaw"),
                new Abonent("Maria", "Kurochkina", "1234", LocalDate.of(2000, 8, 23), LocalDate.of(2023, 05, 05), false, "Krakow"),
                new Abonent("Artem", "Volia", "1234", LocalDate.of(1985, 4, 25), LocalDate.of(2023, 05, 05), false, "Warshawa"),
                new Abonent("Jack", "Jakovich", "1234", LocalDate.of(1989, 2, 20), LocalDate.of(2023, 05, 05), true, "Warshawa"),
                new Abonent("Sveta", "Svetovich", "1234", LocalDate.of(2001, 12, 5), LocalDate.of(2023, 05, 05), false, "Wroclaw")));



        boolean vip = serviceAbonent.isAnyVipAbonentsFromCity(abonents, "Warshawa");
        System.out.println(vip);

        boolean dateConnect = serviceAbonent.isAllAbonentsContractBefore(abonents, LocalDate.of(2024,5,5));
        System.out.println(dateConnect);

        Abonent anyAbonent = serviceAbonent.findAnyAbonentFromCity(abonents, "Warshawa");
        System.out.println(anyAbonent);











    }
}
