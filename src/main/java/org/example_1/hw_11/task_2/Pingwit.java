package org.example_1.hw_11.task_2;

import org.example_1.hw_11.task_1.AbstractPhone;
import org.example_1.hw_11.task_1.SmartPhone;

public class Pingwit {
    public static void main(String[] args) {

        AbstractPhone abstractPhone = new SmartPhone("Iphone","14 Pro");

        char[] chars = new char[]{'I', 'l', 'l', 'i', 'a'};
        String fromChars = String.valueOf(chars);
        System.out.println(fromChars);

        String format = String.format("У меня в руках Iphone %s.", abstractPhone.getModel());
        System.out.println(format);

    }




}