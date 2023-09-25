package trenning.closeble;

import java.io.FileInputStream;
import java.io.IOException;

//Для закрытия потока в Java вы можете использовать метод close(), который определен в интерфейсе Closeable1.
//        Этот метод освобождает все ресурсы, выделенные для потока, например, файл1.
//        Если поток остается открытым, может произойти утечка памяти1.

public class Main {
    public static void main(String[] args) {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("C://SomeDir//notes.txt");
            // чтение данных из файла
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (fin != null)
                    fin.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

//    В этом примере метод close() вызывается в блоке finally, что гарантирует, что поток будет закрыт, даже если при работе с ним возникнет ошибка1.
//
//        Начиная с Java 7, можно использовать конструкцию try-with-resources, которая автоматически вызывает метод close()2.
//        Вот пример использования этой конструкции:
//
//        try(FileInputStream fin = new FileInputStream("C://SomeDir//notes.txt")) {
//        // чтение данных из файла
//        } catch(IOException ex) {
//        System.out.println(ex.getMessage());
//        }
//        В этом примере после окончания работы в блоке try у ресурса (в данном случае у объекта FileInputStream) автоматически вызывается метод close()2.
