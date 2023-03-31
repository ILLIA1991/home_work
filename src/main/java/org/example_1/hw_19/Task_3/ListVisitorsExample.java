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

        VisWeb visWeb = new VisWeb("Vojtek", "media-expert.pl");
        VisWeb visWeb1 = new VisWeb("Vojtek", "media-expert.pl");
        VisWeb visWeb2 = new VisWeb("Vojtek", "media-market.pl");
        VisWeb visWeb3 = new VisWeb("Grzegorz", "YouTube");
        VisWeb visWeb4 = new VisWeb("Jakub", "onliner.by");
        VisWeb visWeb5 = new VisWeb("Krzyshtof", "kinogo.com");
        VisWeb visWeb6 = new VisWeb("Vacek", "Facebook");

        HashMap<String, String> Website = new HashMap<>();

        Website.put(visWeb.getUser(), visWeb.getNameWebsite());
        Website.put(visWeb1.getUser(), visWeb1.getNameWebsite());
        Website.put(visWeb2.getUser(), visWeb2.getNameWebsite());
        Website.put(visWeb3.getUser(), visWeb3.getNameWebsite());
        Website.put(visWeb4.getUser(), visWeb4.getNameWebsite());
        Website.put(visWeb5.getUser(), visWeb5.getNameWebsite());
        Website.put(visWeb6.getUser(), visWeb6.getNameWebsite());

        Set<String> keys = Website.keySet();
        System.out.println("Уникальные Имена" + keys);

        ArrayList<String> values = new ArrayList<>(Website.values());
        System.out.println("Уникальные Сайты" + values);

        HashMap<VisWeb, Integer> visitUser = new HashMap<>();

        visitUser.put(visWeb, 2);
        visitUser.put(visWeb1, 3);
        visitUser.put(visWeb2, 4);
        visitUser.put(visWeb3, 7);
        visitUser.put(visWeb4, 12);
        visitUser.put(visWeb5, 34);
        visitUser.put(visWeb6, 13);

        System.out.println("HashMap:\n" + visitUser);













    }
}
