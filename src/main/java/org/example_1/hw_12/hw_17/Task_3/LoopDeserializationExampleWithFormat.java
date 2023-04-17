package org.example_1.hw_12.hw_17.Task_3;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example_1.hw_12.hw_17.Task_2.Track;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Pavel Radkevich
 * @since 26.03.23
 */
public class LoopDeserializationExampleWithFormat {

    public static void main(String[] args) {
        String pathTemplate = "src/main/java/org/example_1/hw_17/Task_3/Track_%d.json";
        Track[] tracks = new Track[4];

        ObjectMapper mapper = new ObjectMapper();

        for (int i = 0; i < 4; i++) {
            String path = String.format(pathTemplate, i);
            File file = new File(path);
            try {
                Track track = mapper.readValue(file, Track.class);
                tracks[i] = track;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Arrays.toString(tracks));

    }
}
