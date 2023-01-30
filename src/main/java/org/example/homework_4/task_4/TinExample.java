package org.example.homework_4.task_4;

import org.example.homework_4.task_2.Data;

public class TinExample {
    public static void main(String[] args) {
        Data brother = new Data(33, "Andrej");
        System.out.println(brother.age);
        System.out.println(brother.name);
        System.out.println(brother.getText());

        String text = Data.getText();

        brother.setText("Everything will work out");
        System.out.println(brother.getText());

        Data sister = new Data(21, "Dasha");
        System.out.println(sister.age);
        System.out.println(sister.name);
        System.out.println(sister.getText());


    }
}
