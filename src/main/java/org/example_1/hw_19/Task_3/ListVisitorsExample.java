package org.example_1.hw_19.Task_3;
/* Task 3
        Напишите класс, который описывает посещение сайта. В нем должен храниться имя пользователя
        и строка-название посещенного сайта.
        В классе Application создайте список посещений, причем один пользователь мог посещать разные сайты, мог по несколько раз посещать один и тот
        же сайт.
        2.1 Напишите метод, который примет на вход списко посещений и вернет коллекцию уникальных имен пользователей.
        2.2 Напишите метод, который примет на вход список посещений и вернет коллекцию уникальных сайтов.
        2.3 напишите метод, который примет на вход список посещений и вернет Map<String, Integer> в которой хранится количество посещений
 */

import java.util.*;

public class ListVisitorsExample {
    public static void main(String[] args) {

        UserVisit userVisit = new UserVisit("Vojtek", "media-expert.pl");
        UserVisit userVisit1 = new UserVisit("Vojtek", "media-expert.pl");
        UserVisit userVisit2 = new UserVisit("Vojtek", "media-market.pl");
        UserVisit userVisit3 = new UserVisit("Grzegorz", "YouTube");
        UserVisit userVisit4 = new UserVisit("Jakub", "onliner.by");
        UserVisit userVisit5 = new UserVisit("Krzyshtof", "kinogo.com");
        UserVisit userVisit6 = new UserVisit("Vacek", "Facebook");
        List<UserVisit> userVisits = new ArrayList<>(List.of(userVisit, userVisit1, userVisit2, userVisit3, userVisit4, userVisit5, userVisit6));

        Set<String> userNames = findUniqueUsers(userVisits);
        System.out.println("Пользователи системы:" + userNames);

        Set<String> sites = findUniqueSites(userVisits);
        System.out.println("Сайты:" + sites );

        Map<String, Integer> visitsCountForSite = calculateSiteVisitCount(userVisits);
        System.out.println(" Количество посещения одного сайта:" + visitsCountForSite);
    }

    private static Map<String, Integer> calculateSiteVisitCount(List<UserVisit> userVisits) {
        Map<String, Integer> result = new HashMap<>();

        for (UserVisit userVisit : userVisits ) {
            String siteName = userVisit.getNameWebsite();

            if(result.containsKey(siteName)) {
                Integer visitsCount = result.get(siteName);
                Integer updatedCount = visitsCount + 1;
                result.put(siteName , updatedCount);
            } else {
                result.put(siteName, 1);
            }
        }

        return result;
    }

    private static Set<String> findUniqueSites(List<UserVisit> userVisits) {
        Set<String> sites = new HashSet<>();

        for (UserVisit userVisit : userVisits) {
            sites.add(userVisit.getNameWebsite());
        }
        return sites;
    }

    private static Set<String> findUniqueUsers(List<UserVisit> userVisits) {
        Set<String> result = new HashSet<>();

        for(UserVisit userVisit : userVisits) {
            result.add(userVisit.getUser());
        }
        return result;
    }
}
