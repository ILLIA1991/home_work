package org.example_1.hw_30;

/* Java Thread Join — метод, который может быть использован для того, чтобы приостановить выполнение текущего потока до тех пор,
пока другой поток не закончит свое выполнение. Есть три перегруженных метода join().

        Java Thread Join(). Теория
public final void join(). Этот метод приостановит выполнение текущего потока до тех пор, пока другой поток не закончит свое выполнение.
Если поток прерывается, бросается InterruptedException.

public final synchronized void join(long millis): Этот метод приостановит выполнение текущего потока на указанное время в миллисекундах.
Выполнение этого метода зависит от реализации ОС, поэтому Java не гарантирует, что текущий поток будет ждать указанное вами время.

public final synchronized void join(long millis, int nanos): Этот метод приостановит выполнение текущего потока до тех пор,
пока другой поток не закончит свое выполнение на время заданное в миллисекундах плюс наносекундах.

        Вот простой пример, показывающий использование метода join(). Цель программы: убедиться в том,
        что третий поток начнет работу только тогда, когда первый закончит выполнение.
*/

public class ThreadJoinExample {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");

        t1.start();
//стартуем второй поток только после 2-секундного ожидания первого потока (или когда он умрет/закончит выполнение)
        try {
            t1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
//стартуем 3-й поток только после того, как 1 поток закончит свое выполнение
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
//даем всем потокам возможность закончить выполнение перед тем, как программа (главный поток) закончит свое выполнение
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Поток начал работу:::" + Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток отработал:::" + Thread.currentThread().getName());

    }
}













