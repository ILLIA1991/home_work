package org.example.homework_4.task_2;

public class Data {

    public int age = 31;
    public String name = "Illia";

    private static String text = "Everything will work out";

    public static String getText() {
        return text;
    }

    public void setText(String text) {
        Data.text = text;
    }


    public Data(Integer age, String name) {
        this.age = age;
        this.name = name;

    }

    public Data() {

    }

    @Override
    public String toString() {
        return "Data{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    {
        System.out.println("Create a new class instance");
    }
}
