package org.example_1.hw_14.task_1;

import org.apache.commons.lang3.RandomUtils;

public class DatabaseConnectorImpl implements DatabaseConnector  {

    public byte[] connectToDatabase() throws DatabaseChekedException {
        if (RandomUtils.nextBoolean()) {
            throw new DatabaseChekedException("Connect to DataBase");
        }
        System.out.println("Congratulation");
        return new byte[0];
    }
}
