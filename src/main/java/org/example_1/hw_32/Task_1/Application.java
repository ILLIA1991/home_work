package org.example_1.hw_32.Task_1;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        GravelHeap gravelHeap = new GravelHeap(0);

        Truck truck = new Truck(gravelHeap);
        System.out.println("Первый грузовик:");
        truck.start();
        truck.join();

        Truck truck1 = new Truck(gravelHeap);
        System.out.println("Второй грузовик:");
        truck1.start();
        truck1.join();

        Truck truck2 = new Truck(gravelHeap);
        System.out.println("Третий грузовик:");
        truck2.start();
        truck2.join();

        Truck truck3 = new Truck(gravelHeap);
        System.out.println("Четвертый грузовик:");
        truck3.start();
        truck3.join();

        System.out.println("Общая масса кучи: " + gravelHeap.getWeight() + " килограмм");
    }

}
