package org.example_1.hw_19.Task_1;

/* Task 1
Создайте класс для описания футбольного клуба, в нем должны содержаться название клуба, страна, и город.
В классе Application создайте список клубов из разных стран.
Имея этот список клубов, в консоль в алфавитном порядке их страны. Страны не должны повторяться.
 */

import java.util.*;

public class ListClubsExample {
    public static void main(String[] args) {

        FootballClub footballClub = new FootballClub("Barcelona", "Spain", "Barcelona");
        FootballClub footballClub1 = new FootballClub("Porto", "Portugal", "Porto");
        FootballClub footballClub2 = new FootballClub("Chelsea", "England", "London");
        FootballClub footballClub3 = new FootballClub("Dynamo", "Belarus", "Minsk");
        List<FootballClub> clubArrayList = new ArrayList<>(List.of(footballClub, footballClub1, footballClub2, footballClub3));
        // Так как нам нужны только страны, использовать Map здесь избыточно и было бы достаточно использовать Set
        // это также упростило бы код
        // попробуй переписать на Set
        Map<String, List<FootballClub>> clubsByCountry = new HashMap<>();

        // здесь переменную нужно именовать в единственном числе, не clubs, а club
        for (FootballClub clubs : clubArrayList ) {
            String country = clubs.getCountry();
            if (clubsByCountry.containsKey(country)) {
                List<FootballClub> clubList = clubsByCountry.get(country);
                clubList.add(clubs);
            } else {
                clubsByCountry.put(country, new ArrayList<>(List.of(clubs)));
            }

        }
        for (Map.Entry<String, List<FootballClub>> stringListEntry : clubsByCountry.entrySet()) {
            System.out.println(stringListEntry.getKey());
        }

    }
}
