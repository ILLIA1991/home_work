package trenning.multithreading;

public class MyRunnable  implements Runnable{
    @Override
    public void run() {
        System.out.println("Мой поток запущен!");
    }
}
