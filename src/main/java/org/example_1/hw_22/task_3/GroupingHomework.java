package org.example_1.hw_22.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingHomework {

    public static void main(String[] args) {
        AutoInfo autoInfo1 = new AutoInfo("VW", "Polo", 3, 1.0f);
        AutoInfo autoInfo2 = new AutoInfo("VW", "Passat", 4, 1.6f);
        AutoInfo autoInfo3 = new AutoInfo("Skoda", "Fabia", 3, 1.2f);
        AutoInfo autoInfo4 = new AutoInfo("BMW", "5-series", 6, 3.0f);
        AutoInfo autoInfo5 = new AutoInfo("BMW", "2-series", 3, 1.5f);
        AutoInfo autoInfo6 = new AutoInfo("Toyota", "Tundra", 6, 3.7f);
        AutoInfo autoInfo7 = new AutoInfo("Audi", "A8", 8, 4.0f);

        List<AutoInfo> autoInfos = new ArrayList<>(List.of(autoInfo1, autoInfo2, autoInfo3, autoInfo4, autoInfo5, autoInfo6, autoInfo7));


        // напишите метод, который примет на вход autoInfos и сгруппирует авто по марке. он должен возвращать Map<String, List<AutoInfo>>

        // напишите метод, который примет на вход autoInfos и сгруппирует объемы моторов по количеству цилиндров. он должен возвращать Map<Integer, List<Float>>

        Map<String, List<AutoInfo>> autoByBrand = autoInfos.stream().collect(Collectors.groupingBy(AutoInfo::getBrand));
        for (Map.Entry<String, List<AutoInfo>> stringListEntry : autoByBrand.entrySet()) {
            System.out.println(stringListEntry.getKey());
            for (AutoInfo autoInfo : stringListEntry.getValue()) {
                System.out.println(autoInfo.getModel());
            }
        }

        /*Map<Integer, List<Float>> autoCylinderCount = autoInfos.stream().collect(Collectors.groupingBy(AutoInfo::getCylinderCount, Collectors.counting()));
        for (Map.Entry<Integer, List<Float>> integerListEntry : autoCylinderCount.entrySet()) {
            System.out.println(integerListEntry.getKey());
            for (Float aFloat : integerListEntry.getValue()) {
                System.out.println(aFloat.floatValue());
                */


    }

}
