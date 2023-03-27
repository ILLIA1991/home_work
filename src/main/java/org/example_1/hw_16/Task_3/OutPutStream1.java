package org.example_1.hw_16.Task_3;

import java.io.*;

public class OutPutStream1 {

    public static void main(String[] args) {

        String path = "src/main/java/org/example_1/hw_16/Task_3/output.txt";

        File file = new File(path);

        try (OutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write("Ja perdole".getBytes());
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
