package trenning.inputstream.readAllBytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        Path path = Paths.get("demo.txt");
        try {
            byte[] bytes = Files.readAllBytes(path);
            String content = new String(bytes);
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
  //  Использование Files.readAllBytes(Path)12: Этот метод принимает путь к файлу и возвращает массив байтов, содержащий байты, считанные из файла
//Обратите внимание, что оба этих метода могут вызвать IOException, поэтому их следует вызывать в блоке try-catch