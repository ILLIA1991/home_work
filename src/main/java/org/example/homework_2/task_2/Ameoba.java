package org.example.homework_2.task_2;

public class Ameoba { // Ameoba -> amoeba
    public static void main(String[] args) {
        int ameoba = 1;
        // j = j + 3, ameoba *= 2 старайся избегать таких сложных конструкций. 
        // Внутри () здесь должны быть условия для цикла, а не все подсчеты, хотя технически это вохможно
        for (int j = 0; j <= 24; j = j + 3, ameoba *= 2) { 
            System.out.println("In" + j + "hr - " + " " + ameoba);
        }
    }
}
