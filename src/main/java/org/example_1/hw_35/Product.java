package org.example_1.hw_35;

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

            PreparedStatement statement = connection.prepareStatement("SELECT * FROM products LIMIT 2 OFFSET 0");
            ResultSet resultSet = statement.executeQuery();

            List<ProductRecord> productList = new ArrayList<>();
            while (resultSet.next()) {
                ProductRecord productRecord = new ProductRecord(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDouble(4));
                productList.add(productRecord);
            }

            productList.forEach(System.out::println);

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
