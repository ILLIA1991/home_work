package trenning.hashset;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("Java");
        set.add("Spring");
        set.add("SQL");

        boolean isAdded = set.add("Postgres");

        System.out.println("Элемент был добавлен: " + isAdded);

        for (String str:set) {
            System.out.println(str);

        }
    }
}
