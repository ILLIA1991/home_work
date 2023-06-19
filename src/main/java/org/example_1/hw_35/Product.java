package org.example_1.hw_35;

/*1. Работа с таблицей products. Создайте класс Product, который соответствует таблице products.
 С помощью цикла выведите все продукты в консоль, но за один запрос нужно прочитать 2 продукта
 SELECT * FROM products LIMIT 2 OFFSET 0
 SELECT * FROM products LIMIT 2 OFFSET 2
 SELECT * FROM products LIMIT 2 OFFSET 4 .....
 Для создания запроса используйте объект PreparedStatement
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private static final String URL = "jdbc:postgresql://localhost:5432/hw_35";
    private static final String NAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";




    public static void main(String[] args) {
        runSelectAllQuery();
    }
    public static void runSelectAllQuery() {

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, NAME, PASSWORD);

            PreparedStatement statement;
            ResultSet resultSet;

            int offset = 0;
            int limit = 2;
            int counter = 0;

            while (true) {
                statement = connection.prepareStatement("SELECT * FROM products LIMIT ? OFFSET ?");
                statement.setInt(1, limit);
                statement.setInt(2, offset);
                resultSet = statement.executeQuery();

                List<ProductRecord> productList = new ArrayList<>();
                while (resultSet.next() && counter < limit) {
                    ProductRecord productRecord = new ProductRecord(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDouble(4));
                    productList.add(productRecord);
                    counter++;
                }

                if (productList.isEmpty()) {
                    break;
                }

                productList.forEach(System.out::println);
                System.out.println();

                offset += limit;
                counter = 0;
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
