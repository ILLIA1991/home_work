package org.example_1.hw_27.task_3;

import org.example_1.hw_27.Task_1.Abonent;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

public class ServiceAbonent {
    public Map<String, Abonent> abonentMap (List<Abonent> abonents) {
        Map<String, Abonent> noVipMap = abonents.stream()
                .filter(abonent -> !abonent.getVip())
                .collect(toMap(Abonent::getContractId, Function.identity()));
        return noVipMap;
    }

    public Map<String, List<Abonent>> abonentGroupingMap (List<Abonent> abonents) {
        Map<String, List<Abonent>> cityListMap = abonents.stream()
                .collect(groupingBy(Abonent::getCity));
        return cityListMap;
    }
}
