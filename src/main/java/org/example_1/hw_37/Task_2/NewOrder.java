package org.example_1.hw_37.Task_2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NewOrder {
    private static final String URL = "jdbc:postgresql://localhost:5432/hw_35";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    public static void main(String[] args) {
        CreatingNewOrderInTransaction();
    }

    // параметризация NewTransactionorders здесь не нужен
    public static void CreatingNewOrderInTransaction() {

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL,USERNAME, PASSWORD);

            connection.setAutoCommit(false);


            String insertOrderQuery = "INSERT INTO orders (id, user_id, created_at, status_id, comment) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement orderStatement = connection.prepareStatement(insertOrderQuery);
            orderStatement.setInt(1, 21);
            orderStatement.setInt(2, 19);
            orderStatement.setDate(3, Date.valueOf("2025-09-12"));
            orderStatement.setInt(4, 15);
            orderStatement.setString(5, "New order");
            orderStatement.executeUpdate();

            OrderItem orderItem3 = new OrderItem(19, 21, 101, 8);
            OrderItem orderItem1 = new OrderItem(38, 21, 111, 6);
            OrderItem orderItem2 = new OrderItem(56, 21, 121, 4);

            String insertOrderItemQuery = "INSERT INTO order_items (id, order_id, product_id, quantity) VALUES (?, ?, ?, ?)";
            PreparedStatement orderItem = connection.prepareStatement(insertOrderItemQuery);



            // переменную предлагаю переименовать
            List<OrderItem> transactionOrders = new ArrayList<>();
            transactionOrders.add(orderItem3);
            transactionOrders.add(orderItem1);
            transactionOrders.add(orderItem2);


            // переменную рекомендую переименовать, это будет orderItem
            for(OrderItem orderItemLoop : transactionOrders) {
                orderItem.setInt(1, orderItem3.id());
                orderItem.setInt(2, orderItem3.order_id());
                orderItem.setInt(3, orderItem3.product_id());
                orderItem.setInt(4, orderItem3.quantity());
                orderItem.addBatch();
                System.out.println(orderItemLoop);
            }

            // супер, batch - это эффективно
            orderItem.executeBatch();
            connection.commit();

            System.out.println("Транзакция успешно завершена.");
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }
    }
}
