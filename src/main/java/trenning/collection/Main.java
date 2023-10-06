package trenning.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set  = new HashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");

        boolean isAdded = set.add("D");
        System.out.println("Элемент был добавлен: " + isAdded);

//        set.stream().sorted();
//        System.out.println(set);

        for (String element : set) {
            System.out.println(element);

        }



    }
}
