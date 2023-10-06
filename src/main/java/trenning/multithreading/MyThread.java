package trenning.multithreading;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Мой поток запущен!");
    }
}
