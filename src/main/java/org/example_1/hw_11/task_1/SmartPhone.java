package org.example_1.hw_11.task_1;

public class SmartPhone extends AbstractPhone  {

    public SmartPhone(String name, String model) {
        super(name, model);
    }

    @Override
    public void makeCall() {
        System.out.println("Сделать видеозвонок:");

    }

    @Override
    public void recieveCall() {
        System.out.println("Принять видеозвонок:");

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }
}
