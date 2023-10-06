package trenning.inputstream.readAllLines;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Path path = Paths.get("demo.txt");
        try {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            lines.stream().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//    Использование Files.readAllLines(Path, Charset)12: Этот метод принимает путь к файлу и кодировку,
//        используемую для декодирования байтов в символы. Он возвращает строки из файла в виде списка12.