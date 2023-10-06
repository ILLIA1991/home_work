package org.example_1.hw_25.Task_4;

/*
        Task 4
        Создать метод, который бы принимал на вход List<UserClass> и предикат, по которому все юзеры, у которых имена начинаются с A,P,E удалялись бы из этого листа
*/

import org.apache.commons.collections4.Predicate;

import java.util.ArrayList;


import java.util.List;

import static java.util.stream.Collectors.toList;

// Все хорошо
public class TestUsersPredicates {

    public static void main(String[] args) {

        List<String> users = new ArrayList<>();
        users.add("Вальдемар");
        users.add("Раиса");
        users.add("Егор");
        users.add("Антон");
        //System.out.println(users);

        users.removeIf(s -> s.startsWith("А"));
        users.removeIf(s -> s.startsWith("Р"));
        users.removeIf(s -> s.startsWith("Е"));
        System.out.println(users);

    }

}

