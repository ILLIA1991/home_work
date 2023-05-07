package org.example_1.hw_26.Task_2;

import java.util.List;
import java.util.stream.Collectors;

public class AddressList {

    public static void main(String[] args) {
        List<Address> addresses = List.of(
                new Address("Kiev", "Andriyivsky Descent", 25, 11),
                new Address("Kiev", "Antonovich Street", 12, 3),
                new Address("Kiev", "Andriyivsky Descent", 25, 11),
                new Address("Charkov", "Andriyivsky Descent", 25, 11),
                new Address("Charkov", "Poltavskyi Shlyakh", 13, 9),
                new Address("Charkov", "Poltavskyi Shlyakh", 13, 9),
                new Address("Lvov", "Andriyivsky Descent", 25, 11),
                new Address("Lvov", "Bogdan Khmelnitsky", 3, 8),
                new Address("Lvov", "Bogdan Khmelnitsky", 3, 8));

        List<Address> city = addresses.stream()
                .filter(cityList -> cityList.getCity().equals("Kiev"))
                .collect(Collectors.toList());
        System.out.println(city);
    }
}
