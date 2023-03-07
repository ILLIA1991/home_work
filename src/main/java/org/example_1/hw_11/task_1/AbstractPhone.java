package org.example_1.hw_11.task_1;

// нужно отформатировать код
public abstract class AbstractPhone implements Phone{

    private String name;
    private String model;

    public AbstractPhone(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "AbstractPhone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
