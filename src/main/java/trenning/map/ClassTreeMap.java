package trenning.map;

import java.util.Map;
import java.util.TreeMap;

public class ClassTreeMap {
    public static void main(String[] args) {

        TreeMap<Integer, String> classMap = new TreeMap<>();

        classMap.put(1, "One");
        classMap.put(2, "Two");
        classMap.put(3, "Three");

        System.out.println("Исходный TreeMap: " + classMap);

        //Удаление элемента
        String removedElement = classMap.remove(2);
        System.out.println("Удален элемент: " + removedElement);
        System.out.println("TreeMap после удаления: " + classMap);

        //Проверка наличия ключа
        boolean isContains = classMap.containsKey(1);
        System.out.println("Содержит ключ 1: " + isContains);

        //Получение значения по ключу
        String value = classMap.get(3);
        System.out.println("Значение ключа 3: " + value);

        System.out.println("Итерация по элементам с помощью classMap");
        for (Map.Entry<Integer, String> entry:classMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

        }

        //Получение и вывод на экран первого (наименьшего) и последнего (наибольшего) ключей
        System.out.println("First key: " + classMap.firstKey());
        System.out.println("Last key: " + classMap.lastKey());

        //Создание подкарты  из исходного TreeMap
        TreeMap<Integer, String> subTreeMap = new TreeMap<>(classMap.subMap(1, true, 3, true));
        System.out.println("Подкарта: " + subTreeMap);

    }
}
