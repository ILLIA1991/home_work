package org.example_1.hw_26.Task_3;

import org.example_1.hw_26.Task_2.Address;

import java.util.List;
import java.util.stream.Collectors;

public class AddressList {
    public static void main(String[] args) {

        List<Address> address = List.of(
                new Address("Kiev", "Andriyivsky Descent", 25, 11),
                new Address("Kiev", "Antonovich Street", 12, 3),
                new Address("Kiev", "Andriyivsky Descent", 25, 11),
                new Address("Charkov", "Darwin street", 17, 7),
                new Address("Charkov", "Poltavskyi Shlyakh", 13, 9),
                new Address("Charkov", "Poltavskyi Shlyakh", 13, 9),
                new Address("Lvov", "High Castle", 2, 18),
                new Address("Lvov", "Bogdan Khmelnitsky", 3, 8),
                new Address("Lvov", "Bogdan Khmelnitsky", 3, 8));

        List<String> street = address.stream()
                .map(Address::getStreet)
                .collect(Collectors.toList());
        System.out.println(street);

    }
}
