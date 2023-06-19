package org.example_1.hw_37.Task_2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NewTransactionOrder {
    private static final String URL = "jdbc:postgresql://localhost:5432/hw_35";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    public static void main(String[] args) {
        CreatingNewOrderInTransaction();
    }

    public static <NewTransactionorders> void CreatingNewOrderInTransaction() {

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

            TransactionRecord transactionRecord = new TransactionRecord(19, 21, 101, 8);
            TransactionRecord transactionRecord1 = new TransactionRecord(38, 21, 111, 6);
            TransactionRecord transactionRecord2 = new TransactionRecord(56, 21, 121, 4);

            String insertOrderItemQuery = "INSERT INTO order_items (id, order_id, product_id, quantity) VALUES (?, ?, ?, ?)";
            PreparedStatement orderItemStatement = connection.prepareStatement(insertOrderItemQuery);



            List<TransactionRecord> transactionList = new ArrayList<>();
            transactionList.add(transactionRecord);
            transactionList.add(transactionRecord1);
            transactionList.add(transactionRecord2);


            for(TransactionRecord transactionRecordLoop : transactionList) {
                orderItemStatement.setInt(1, transactionRecord.id());
                orderItemStatement.setInt(2, transactionRecord.order_id());
                orderItemStatement.setInt(3, transactionRecord.product_id());
                orderItemStatement.setInt(4, transactionRecord.quantity());
                orderItemStatement.addBatch();
                System.out.println(transactionRecordLoop);
            }

            orderItemStatement.executeBatch();
            connection.commit();

            System.out.println("Транзакция успешно завершена.");
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }
    }
}
