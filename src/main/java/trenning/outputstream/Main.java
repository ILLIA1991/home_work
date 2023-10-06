package trenning.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String data = "Привет, мир!";
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//    В этом примере мы создаем объект FileOutputStream, связанный с файлом “output.txt”.
//        Затем мы записываем строку “Привет, мир!” в файл, используя метод write()
//        1. Обратите внимание, что метод write() принимает массив байтов, поэтому мы преобразуем строку в массив байтов с помощью метода getBytes()1.
//
//        Также обратите внимание на использование блока try-with-resources.
//        Это гарантирует, что поток будет закрыт после того, как мы закончим работу с ним,
//        даже если произойдет исключение