package org.example_1.hw_19.Task_1;

import java.util.*;

public class ListClubsExample {
    public static void main(String[] args) {

        FootballClubs footballClubs = new FootballClubs("Barcelona", "Spain", "Barcelona");
        FootballClubs footballClubs1 = new FootballClubs("Porto", "Portugal", "Porto");
        FootballClubs footballClubs2 = new FootballClubs("Chelsea", "England", "London");
        FootballClubs footballClubs3 = new FootballClubs("Dynamo", "Belarus", "Minsk");

        Set<FootballClubs> clubs = new HashSet<>();
        clubs.add(footballClubs);
        clubs.add(footballClubs1);
        clubs.add(footballClubs2);
        clubs.add(footballClubs3);

        System.out.println(clubs);

        SortedSet<String> sortedSet = new TreeSet<>();
        // а если клубов будет 30? плиз, переделай это, используя цикл
        sortedSet.add(footballClubs.getCountry());
        sortedSet.add(footballClubs1.getCountry());
        sortedSet.add(footballClubs2.getCountry());
        sortedSet.add(footballClubs3.getCountry());
        System.out.println(sortedSet);



    }
}
