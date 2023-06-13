package org.example_1.hw_35;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Product2 {
    private static final String URL = "jdbc:postgresql://localhost:5432/hw_35";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    public static void main(String[] args) {

        // sql injection
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

             ProductRecord newProduct = new ProductRecord(70, "Jogurt", "Kukaracha",  10.44);
             ProductRecord newProduct1 = new ProductRecord(152, "Soczek", "Czponks",  10.43);
             ProductRecord newProduct2 = new ProductRecord(159, "Kielbasa", "Kopibast",  10.29);
            PreparedStatement statement = connection.prepareStatement("INSERT INTO products (id, name, description, price) VALUES (?, ?, ?, ?)");

            statement.setInt(1, newProduct.id());
            statement.setString(2, newProduct.name());
            statement.setString(3, newProduct.description());
            statement.setDouble(4, newProduct.price());
            statement.executeUpdate();

            statement.setInt(1, newProduct1.id());
            statement.setString(2, newProduct1.name());
            statement.setString(3, newProduct1.description());
            statement.setDouble(4, newProduct1.price());
            statement.executeUpdate();

            statement.setInt(1, newProduct2.id());
            statement.setString(2, newProduct2.name());
            statement.setString(3, newProduct2.description());
            statement.setDouble(4, newProduct2.price());
            statement.executeUpdate();




        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
