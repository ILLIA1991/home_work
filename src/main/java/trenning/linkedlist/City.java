package trenning.linkedlist;

import java.util.LinkedList;

public class City {
    public static void main(String[] args) {
        LinkedList<String> city = new LinkedList<String>();

        city.add("Minsk");
        city.addLast("New York");
        city.addFirst("Wroclaw");
        city.add("Poznan");
        city.add(2, "Gomel");

        for (String str: city) {
            System.out.println(str);

        }
    }
}
