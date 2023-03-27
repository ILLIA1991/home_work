package org.example_1.hw_17.Task_1;

import java.io.*;

public class Application {
    public static void main(String[] args) {

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setBrand("Harley Davidson");
        motorcycle.setModel("Sportster");
        motorcycle.setEngineVolume(1300);
        motorcycle.setCondition("New");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/java/org/example_1/hw_17/Task_1/Harley.txt"))) {
            objectOutputStream.writeObject(motorcycle);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/java/org/example_1/hw_17/Task_1/Harley.txt"))) {
            Motorcycle o = (Motorcycle)  objectInputStream.readObject();
            System.out.println(o);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
