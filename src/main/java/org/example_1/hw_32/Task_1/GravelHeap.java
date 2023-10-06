package org.example_1.hw_32.Task_1;
/*
Task 1
        Gеревозка щебня. Cоздайте класс для описания класса-кучи щебня GravelHeap.
        D нем должно быть одно поле private final int weight, в котором хранится вес кучи щебня в тоннах.
        У GravelHeap должен быть метод increase(int amount) - отгрузить, который увеличит вес кучи щебня на amount тонн.
        создайте класс Truck, который представляет грузовик для перевозки грузов.
        В конструкторе передается ссылка на кучу щебня. Класс truck должен наследоваться от класса MyThread и в методе run
        в цикле на 1250 итераций должен привозить 2 тонны щебня (написать в консоль “Привез 2 тонны”  и “засыпать” (MyThread.sleep(100)).
        В классе application создайте пустую кучу щебня, создайте 4 объекта грузовиков и у всех четырех вызовите метод start().
        Дождитесь завершения выполнения работы всех грузовиков, и распечатайте вес щебня в консоль.

        Скорее всего, вес щебня в куче не будет равен 10000. Доработайте программу, чтобы вес всегда был равен 10000.
*/
public class GravelHeap {

    private int weight;

    public GravelHeap(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    void increase(int amount) {
        weight += amount;

    }

    @Override
    public String toString() {
        return "GravelHeap{" +
                "weight=" + weight +
                '}';
    }
}
