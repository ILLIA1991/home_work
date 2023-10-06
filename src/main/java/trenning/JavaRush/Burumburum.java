package trenning.JavaRush;

import java.util.Scanner;

public class Burumburum {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести число");
        int number = scanner.nextInt();

        System.out.println("Вывести четное число");

        if (number%2==0) {
            number -= 44;
            System.out.println(number);
        }
        System.out.println("Вывести нечетное чило");

        if (number%2==0) {
            number -= 47;
            System.out.println(number);
        }

    }
}
