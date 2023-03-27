package org.example_1.hw_17.Task_2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class TrackDiserializetion {
    public static void main(String[] args)  {

        ObjectMapper objectMapper = new ObjectMapper();
        ObjectReader  objectReader = objectMapper.readerFor(Track.class);

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/main/java/org/example_1/hw_17/Task_2/Track_0.json"));
             BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("src/main/java/org/example_1/hw_17/Task_2/Track_1.json"));
             BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("src/main/java/org/example_1/hw_17/Task_2/Track_2.json"));
             BufferedInputStream bis3 = new BufferedInputStream(new FileInputStream("src/main/java/org/example_1/hw_17/Task_2/Track_3.json"))) {


            byte[] bytes = bis.readAllBytes();
            byte[] bytes1 = bis1.readAllBytes();
            byte[] bytes2 = bis2.readAllBytes();
            byte[] bytes3 = bis3.readAllBytes();
            Track track = objectReader.readValue(bytes);
            Track track1 = objectReader.readValue(bytes1);
            Track track2 = objectReader.readValue(bytes2);
            Track track3 = objectReader.readValue(bytes3);
            String[] ArrayTracks = new String[]{String.valueOf(track), String.valueOf(track1), String.valueOf(track2), String.valueOf(track3)};
            System.out.println();
            System.out.println(Arrays.toString(ArrayTracks));


        } catch (IOException e) {
            throw new RuntimeException(e);


        }
    }
}
