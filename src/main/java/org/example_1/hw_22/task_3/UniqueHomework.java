package org.example_1.hw_22.task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UniqueHomework {

    public static void main(String[] args) {
        AutoInfo autoInfo1 = new AutoInfo("VW", "Polo", 3, 1.0f);
        AutoInfo autoInfo2 = new AutoInfo("VW", "Passat", 4, 1.6f);
        AutoInfo autoInfo3 = new AutoInfo("Skoda", "Fabia", 3, 1.2f);
        AutoInfo autoInfo4 = new AutoInfo("BMW", "5-series", 6, 3.0f);
        AutoInfo autoInfo5 = new AutoInfo("BMW", "2-series", 3, 1.5f);
        AutoInfo autoInfo6 = new AutoInfo("Toyota", "Tundra", 6, 3.7f);
        AutoInfo autoInfo7 = new AutoInfo("Audi", "A8", 8, 4.0f);

        // тут решение неправильное, надо еще поразбираться
        List<AutoInfo> autoInfos = new ArrayList<>(List.of(autoInfo1, autoInfo2, autoInfo3, autoInfo4, autoInfo5, autoInfo6, autoInfo7));
        Collections.sort(autoInfos);
        for(AutoInfo autoInfo : autoInfos) {
            System.out.println(autoInfo.getBrand() + " ");

        }
        System.out.println("");

        Collections.sort(autoInfos);
        for (AutoInfo autoInfo11 : autoInfos) {
            System.out.println(autoInfo11.getModel() + " " );
        }


        // напишите метод, который примет autoInfos и вернет коллекцию марок, упорядоченных по алфавиту. какая это будет коллекция - решите сами
        // напишите метод, который примет autoInfos и вернет коллекцию моделей, упорядоченных по алфавиту. какая это будет коллекция - решите сами
    }
}
