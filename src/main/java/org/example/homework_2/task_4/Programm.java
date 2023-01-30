package org.example.homework_2.task_4;

public class Programm {
    public static void main(String[] args) {
        int a = 8;
        int b;
        for (b = 0; b < 120; b = (b + a)) {
            System.out.println(b);
        }

        /*
        я бы хотел увидеть в этой задаче два числа
        int a = 8;
        int b = 10.
        
        далее цикл, в котором мы сложение заменяем умножением и результат выводим на экран.
        Результат достаточно вывести 1 раз
        Если заменить 120 на 8, то результат программы 0, а ожидалось 8*8=64
        */
    }
}
