package org.example_1.hw_11.task_1;

public class Application {
    public static void main(String[] args) {
        AbstractPhone abstractPhone = new SmartPhone("Iphone","14 Pro");
        abstractPhone.makeCall();
        abstractPhone.recieveCall();
    }
}
