package org.example_1.hw_19.Task_2;

/*Task 2
        Создайте класс для описания товара в чеке. В классе храните int id (артикул), название товара и BigDecimal цену одной единицы товара.
        В классе Application создайте список товаров (как в корзине в магазине), добавьте в него товары, причем некоторые товары добавьте
        по несколько раз.
        Напишите метод, который принимает на вход этот список, и выводит в консоль чек: товар - количество и в конце суммарную стоимость всех товаров в чеке.
        каждого сайта

 */

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.math.BigDecimal.*;

public class Shopping {
    public static void main(String[] args) {

        Product product = new Product(1225, "Banana", 2);
        Product product1 = new Product(1226, "Pineapple", 4);
        Product product2 = new Product(1227, "Strawberry", 3);
        Product product3= new Product(1227, "Strawberry", 3);
        Product product4 = new Product(1229, "Apricot", 5);
        Product product5 = new Product(1229, "Apricot", 5);
        ArrayList<Product> fruitBasket = new ArrayList<>(List.of(product, product1, product2, product3, product4, product5));

        calculateCheck(fruitBasket);
    }

    private static void calculateCheck(ArrayList<Product>fruitBasket) {
        Map<Product, Integer> itemCount = new HashMap<>();
        for (Product product : fruitBasket) {
            if (itemCount.containsKey(product)) {
                Integer count = itemCount.get(product);
                Integer updateCount = count +1;
                itemCount.put(product, updateCount);
            } else {
                itemCount.put(product, 1);
            }
        }
        BigDecimal sum =  ZERO ;
        for (Map.Entry<Product, Integer> entry : itemCount.entrySet()) {
            BigDecimal price = entry.getKey().getPrice();
            sum = sum.add(price.multiply(BigDecimal.valueOf(entry.getValue())));
        }
        System.out.println(itemCount);
        System.out.println(sum);

    }
}
