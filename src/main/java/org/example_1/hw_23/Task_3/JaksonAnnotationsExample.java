package org.example_1.hw_23.Task_3;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example_1.hw_23.Task_1.AccountInformation;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class JaksonAnnotationsExample {

    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();

        AccountInformation accountInformation= new AccountInformation("Illia", "Belikau", "ilasemcenkov1@gmail.com", 730219815);

        try (BufferedOutputStream bigBos = new BufferedOutputStream(new FileOutputStream("src/main/java/org/example_1/hw_23/Task_3/account.json"))) {
            byte[] bytes = objectMapper.writeValueAsBytes(accountInformation);
            bigBos.write(bytes);
            bigBos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
