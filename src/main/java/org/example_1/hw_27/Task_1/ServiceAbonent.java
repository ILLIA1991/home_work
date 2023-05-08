package org.example_1.hw_27.Task_1;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ServiceAbonent {

    public boolean anyAbonents (List<Abonent> abonents) {
        boolean any = abonents.stream()
                .anyMatch(Abonent::getVip);

        return any;

    }
    public boolean allAbonents (List<Abonent> abonents) {
        LocalDate date =  LocalDate.now();
        boolean all = abonents.stream()
                .allMatch(abonent -> abonent.getContractDate().isBefore(date));
        return all;
    }

    public Optional<Abonent> abonentFromCity (List<Abonent> abonents, String city) {
        Optional<Abonent> abonentCity = abonents.stream()
                .filter(abonent1 -> abonent1.getCity().equals("Warshawa"))
                .findAny();
        Abonent abonent = abonentCity.orElseThrow(() -> new IllegalArgumentException("Это не наш клиент"));
        return abonentCity;
    }


}
