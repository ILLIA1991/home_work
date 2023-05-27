package org.example_1.hw_32.Task_1;

public class Truck extends Thread {

    private final GravelHeap gravelHeap;

    public Truck(GravelHeap gravelHeap) {
        this.gravelHeap = gravelHeap;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1250; i++) {
            synchronized (gravelHeap) {
                gravelHeap.increase(2);
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("Привез 2000 килограмм");
    }
}
