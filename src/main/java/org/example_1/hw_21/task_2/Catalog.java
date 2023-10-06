package org.example_1.hw_21.task_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Catalog {
    public static void main(String[] args) {
        Product product = new Product();
        Map<Integer, Product> mapProduct = new HashMap<>();
        mapProduct.put(12, (new Product(12, "MacBook Air m1 ", "laptop")));
        mapProduct.put(13, (new Product(13, "MacBook Pro m2 ", "laptop")));
        mapProduct.put(14, (new Product(14, "Iphone 12 mini ", "smartphone")));
        mapProduct.put(15, (new Product(15, "Iphone 13 Pro ", "smartphone")));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to electronics store \n" +
                "Catalog menu:\n" +
                "1.Entering an id and searching for a product:\n" +
                "2.Unfortunately there is no such product:\n" +
                "3.Exit directory");
        System.out.println();
        while (true) {
            System.out.println("1:Enter id and choose a product");
            int id = scanner.nextInt();

            if (id == 0) {
                System.out.println("3: Thank you for visiting our store. Come again");
                System.exit(0);
            }
            if (mapProduct.containsKey(id)) {
                System.out.println(mapProduct.get(id));
            } else {
                System.out.printf("2: There is no product with id in our store - %d", id);
                System.out.println();
            }
        }
    }
}
