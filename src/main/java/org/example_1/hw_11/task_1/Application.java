package org.example_1.hw_11.task_1;


public class Application {
    public static void main(String[] args) {
        AbstractPhone abstractPhone = new SmartPhone("Iphone","14 Pro");
        abstractPhone.makeCall();
        abstractPhone.recieveCall();

        SmartPhone mySmart = new SmartPhone("Xiaomi", "Redmi 10");
        mySmart.getName();
        mySmart.getModel();
        mySmart.sayHello();

        // в этой задаче я хотел бы также видеть еще один вид телефонов - например RadioPhone со своим полем,
        // к примеру int workingRadius
        // а здесь хотел бы чтобы создавались несколько телефонов с помощью интерфейса, и на них бы вызывались методы
    }
}
