package org.example_1.hw_2;

public class task_2 {
    public static void main(String[] args) {
        String number1 = "77";
        byte FromString = Byte.parseByte(number1);


        String number2 = "12587";
        short OneString = Short.parseShort(number2) ;

        String number3 = "-78945627";
        int TwoString = Integer.parseInt(number3);

        String number4 = "123.6789";
        float ThreeString = Float.parseFloat(number4);

        String number5 = "-8965.876655";
        double ForString = Double.parseDouble(number5);

        System.out.println(FromString);
        System.out.println(OneString);
        System.out.println(TwoString);
        System.out.println(ThreeString);
        System.out.println(ForString);
    }
}
