package org.example.homework_4.task_3;

import org.example.homework_4.task_2.Data;

public class Array {
    public static void main(String[] args) {
        Data[] ageName = new Data[2];
        ageName[0] = new Data();
        ageName[1] = new Data(30,"Maryna");
        for (int i = 0; i < 2; i++) {
            System.out.println(ageName[i]);
        }


    }
}
