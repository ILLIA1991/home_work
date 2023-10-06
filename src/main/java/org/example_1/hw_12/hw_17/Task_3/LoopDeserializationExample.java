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
public class LoopDeserializationExample {

    public static void main(String[] args) {
        String path0 = "src/main/java/org/example_1/hw_17/Task_3/Track_0.json";
        String path1 = "src/main/java/org/example_1/hw_17/Task_3/Track_1.json";
        String path2 = "src/main/java/org/example_1/hw_17/Task_3/Track_2.json";
        String path3 = "src/main/java/org/example_1/hw_17/Task_3/Track_3.json";

        String[] paths = new String[]{path0, path1, path2, path3};
        Track[] tracks = new Track[4];

        ObjectMapper mapper = new ObjectMapper();

        for (int i = 0; i < paths.length; i++) {
            File file = new File(paths[i]);
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
