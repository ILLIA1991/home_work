package trenning.linkedhashset;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedset = new LinkedHashSet<Integer>();

        linkedset.add(10);
        linkedset.add(20);
        linkedset.add(30);
        linkedset.add(40);

        linkedset.add(10);
        linkedset.add(50);
        System.out.println("LinkedHashSet: " + linkedset);

        boolean isRemoved = linkedset.remove(20);
        System.out.println("Удален элемент 20: " + isRemoved);

        boolean isContains = linkedset.contains(30);
        System.out.println("Содержит элемент 30: " + isContains);

        System.out.print("Итерация по элементам: ");
        for (Integer element:linkedset) {
            System.out.print(element + " ");

        }

    }
}
