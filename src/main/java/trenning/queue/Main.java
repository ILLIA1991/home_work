package trenning.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> main = new LinkedList<>();

        // Добавление элементов в очередь
        main.add("Элемент 1");
        main.add("Элемент 2");
        main.add("Элемент 3");

        System.out.println("Исходная очередь: " + main);

        // Удаление элемента из очереди
//        String removedElement = main.remove();
//        System.out.println("Удален элемент: " + removedElement);
//        System.out.println("Очередь после удаления: " + main);
//
//        String removedElement1 = main.remove();
//        System.out.println("Удален элемент: " + removedElement1);
//        System.out.println("Очередь после удаления: " + main);

        // Проверка наличия элемента в очереди
        boolean isContains = main.contains("Элемент 2");
        System.out.println("Содержит 'Элемент 2': " + isContains);

        // Получение элемента из головы очереди без его удаления
        String headElement = main.peek();
        System.out.println("Головной элемент без удаления: " + headElement);
        System.out.println("Очередь после peek: " + main);

        // Итерация по элементам очереди
        System.out.print("Итерация по элементам: ");
        for (String element : main) {
            System.out.print(element + " ");
        }
    }


}
