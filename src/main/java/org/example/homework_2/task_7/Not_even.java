package org.example.homework_2.task_7;

public class Not_even { // Not_even -> нижнее подчеркивания не используй в названии классов + второе словое с большой буквы. 
    // А если совсем правильно, то Odd название класса сюда хороошо подходит
    public static void main(String[] args) {
        int j = 0;// j -> sum
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                j += i;
                System.out.println(j);
            }
        }
    }
}
