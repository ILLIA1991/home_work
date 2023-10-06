package org.example_1.hw_16.Task_3;

import java.io.*;

public class FileReaderWriter {

    public static void main(String[] args) throws Exception {

         String outputPath = "src/main/java/org/example_1/hw_16/Task_3/output.txt";
         String inputPath = "src/main/java/org/example_1/hw_16/Task_3/Quenn.txt";


        try (InputStream inputStream = new FileInputStream(outputPath);
             OutputStream outputStream = new FileOutputStream(inputPath)) {

            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
