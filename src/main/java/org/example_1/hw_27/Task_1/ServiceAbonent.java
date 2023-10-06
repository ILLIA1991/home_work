package org.example_1.hw_27.Task_1;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ServiceAbonent {

    public boolean isAnyVipAbonentsFromCity(List<Abonent> abonents, String city) {
        boolean any = abonents.stream()
                .filter(abonent -> abonent.getCity().equals(city))
                .anyMatch(Abonent::getVip);

        return any;

    }
    public boolean isAllAbonentsContractBefore(List<Abonent> abonents, LocalDate date) {
        boolean all = abonents.stream()
                .allMatch(abonent -> abonent.getContractDate().isBefore(date));
        return all;
    }

    public Abonent findAnyAbonentFromCity(List<Abonent> abonents, String city) {
        Optional<Abonent> abonentCity = abonents.stream()
                .filter(abonent1 -> abonent1.getCity().equals("Warshawa"))
                .findAny();
        Abonent abonent = abonentCity.orElseThrow(() -> new IllegalArgumentException("Это не наш клиент"));
        return abonent;
    }


}
