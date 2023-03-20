package trenning.Arrays;
/*
Task 1
        Создайте массив строк {"tratata", "sea", "audi", "java", "online"}
        Выведите в консоль строку и ее длину: "Строка tratata имеет длину 7"
        Выведите сумму всех длин строк
*/
public class Task_1 {
    public static void main(String[] args) {

        String[] string = new String[]{"tratata", "sea", "audi", "java", "online"};
        int sum =0;

        for (int i = 0; i < string.length; i++) {
            String myString = string[i];
            System.out.printf("Строка %s это: %s", i, myString);
            System.out.println();
            System.out.println(myString.length());
            sum += myString.length();
        }
        System.out.println("Длинна всех строк:" + sum);


    }
}
