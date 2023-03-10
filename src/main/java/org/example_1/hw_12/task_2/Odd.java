package org.example_1.hw_12.task_2;

public class  Odd {
    public static void print(int num) {
        System.out.print( num + " ");

        if(num != 0){
            print(--num);
        }
    }

    public static void main(String[] args) {
        print(5);
    }

}
