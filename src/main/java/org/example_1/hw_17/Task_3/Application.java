package org.example_1.hw_17.Task_3;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.example_1.hw_17.Task_2.Track;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws Exception  {

        ObjectMapper objectMapper = new ObjectMapper();
        ObjectReader objectReader = objectMapper.readerFor(Track.class);

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/main/java/org/example_1/hw_17/Task_3/Track_0.json"));
             BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("src/main/java/org/example_1/hw_17/Task_3/Track_1.json"));
             BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("src/main/java/org/example_1/hw_17/Task_3/Track_2.json"));
             BufferedInputStream bis3 = new BufferedInputStream(new FileInputStream("src/main/java/org/example_1/hw_17/Task_3/Track_2.json"))) {

            BufferedInputStream[] arrayTrack = new BufferedInputStream[]{bis, bis1, bis2, bis3};

            for (BufferedInputStream bufferedInputStream : arrayTrack ) {
                Track track = objectReader.readValue(bufferedInputStream);
                System.out.println(track);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

