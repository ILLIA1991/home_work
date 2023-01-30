package org.example.homework_4.task_2;

public class DataExample {
    public static void main(String[] args) {
        Data man = new Data();
        System.out.println("Name=" + man.name);
        System.out.println("Age=" + man.age);

        Data girl = new Data(30, "Maryna");
        System.out.println("Name=" + girl.name);
        System.out.println("Age=" + girl.age);
    }

}
