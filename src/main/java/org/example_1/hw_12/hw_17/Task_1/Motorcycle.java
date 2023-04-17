package org.example_1.hw_12.hw_17.Task_1;

/* Task 1
        Создайте класс Motorcycle, в котором должны быть поля brand, model, engineVolume (объем двигателя в см3),
        String condition.
        В классе application создайте объект типа Motocycle и сериализуйте его с помощью java-сериализации. Поле
        condition сериализоваться не должно!
        Далее в этом же классе десериализуйте Motocycle из файла и выведите его в консоль
*/

import java.io.Serializable;

public class Motorcycle implements Serializable {

    private String brand;
    private String model;

    private int engineVolume;
    private transient String condition;
    public Motorcycle() {

    }

    public Motorcycle(String brand, String model, int engineVolume, String condition ) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.condition = condition;
    }

    // как правило, конструкторы размещают от меньшего к большему: сначала конструктор без параметров, потом по возрастанию количесвтва параметров
    // перемести плиз вверх его

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", condition='" + condition + '\'' +
                '}';
    }
}
