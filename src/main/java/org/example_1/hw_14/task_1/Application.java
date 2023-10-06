package org.example_1.hw_14.task_1;

public class Application {
    public static void main (String[] args) {
        // принято создавать ссылки по интерфейсу, DatabaseConnector в данном случае
        DatabaseConnectorImpl databaseConnector = new DatabaseConnectorImpl();
        try {
            databaseConnector.connectToDatabase();
        } catch (DatabaseChekedException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Closed");
        }

    }

}
