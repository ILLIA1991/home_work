package org.example_1.hw_2;

// классы должны именоваться с большой буквы, поправь плиз
public class task_2 {
    public static void main(String[] args) {
        String number1 = "77";
        // переменные должны именоваться с маленькой буквы, в camelCase: fromString. переименуй, плиз
        // для переименования используй средства IDEA: ставишь курсор на переменную - refactor - Rename.
        byte FromString = Byte.parseByte(number1);


        String number2 = "12587";
        // переменные должны именоваться с маленькой буквы, в camelCase: fromString. переименуй, плиз
        short OneString = Short.parseShort(number2) ;

        String number3 = "-78945627";
        // переменные должны именоваться с маленькой буквы, в camelCase: fromString. переименуй, плиз
        int TwoString = Integer.parseInt(number3);

        String number4 = "123.6789";
        // переменные должны именоваться с маленькой буквы, в camelCase: fromString. переименуй, плиз
        float ThreeString = Float.parseFloat(number4);

        String number5 = "-8965.876655";
        // переменные должны именоваться с маленькой буквы, в camelCase: fromString. переименуй, плиз
        double ForString = Double.parseDouble(number5);

        System.out.println(FromString);
        System.out.println(OneString);
        System.out.println(TwoString);
        System.out.println(ThreeString);
        System.out.println(ForString);
    }
}
