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

    // эти методы можно и не переопределять. даже так - их не нужно переопределять без необходимости
    @Override
    public String getName() {
        return super.getName();
    }

    // эти методы можно и не переопределять. даже так - их не нужно переопределять без необходимости
    @Override
    public String getModel() {
        return super.getModel();
    }
}
