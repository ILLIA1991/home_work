package org.example_1.hw_16.Task_4;

import java.io.*;

public class FileInStr {

    public static void main(String[] args) {

        String path = "src/main/java/org/example_1/hw_16/Task_3/Queen.txt";
        File file = new File(path);

        try (InputStream inputStream = new FileInputStream(file)) {

            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
