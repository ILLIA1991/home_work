package trenning.map;

import java.util.HashMap;
import java.util.Map;

public class ClassHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> hash = new HashMap<>();

        hash.put("One", 1);
        hash.put("Two", 2);
        hash.put("Three", 3);
        hash.put("Four", 4);

        System.out.println("Исходный HashMap: " + hash);

        //Удаление элемента
        Integer isRemoved = hash.remove("Two");
        System.out.println("Удален элемент: " + isRemoved);
        System.out.println("HashMap после удаления: " + hash);

        //Проверка наличия ключа
        boolean isContains = hash.containsKey("Three");
        System.out.println("Содержит ключ 'Three': " + isContains);

        //Получения значения
        Integer value = hash.get("Three");
        System.out.println("Значение ключа 'Three: " + value);

        //Итерация по элементам HashMap c использованием EntrySet
        System.out.println("Итерация по элементам с использованием EntrySet");
        for (Map.Entry<String, Integer> entry: hash.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        //Замена значения по ключу в HashMap
        hash.replace("Three", 333);
        System.out.println("HashMap after replace: " + hash);

        //Очистка HashMap
        hash.clear();
        System.out.println("HashMap after clear: " + hash);

    }
}
