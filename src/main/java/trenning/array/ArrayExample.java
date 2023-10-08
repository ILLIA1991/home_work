package trenning.array;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {

        int index = 0;
        int secondIndex = 7;

        int[] myIntArray = new int[4];
        int[] myIntArray2 = new int[] {2,4,6,8};

        //Как положить что-либо в массив
        myIntArray[2] = 4;

        //System.out.println(myIntArray[2]);



        String[] myStringArray2 = new String[3];
        String[] myStringArray3 = new String[] {"One", "Two", "Three"};
//Проходимся по массиву выводим все элементы и высчитываем сумму всех элементов
        int sum = 0;
        for (int i = 0; i < myIntArray2.length; i++) {
            sum += myIntArray2[i];
            System.out.print(myIntArray2[i]);

        }
        System.out.println(sum);



        // Заполнение массива

        int[] myEmptyArray = new int[10];

        for (int i = 0; i < myEmptyArray.length; i++) {
            myEmptyArray[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < myEmptyArray.length; i++) {
            System.out.print(myEmptyArray[i]);

        }
        System.out.println("");
        //переборка элементов с помощью foreach
        for (int element : myEmptyArray) {
            System.out.print(element);


        }
        System.out.println("");
        System.out.println(Arrays.toString(myEmptyArray));

        //Распечатать массив в Java можно с помощью цикла и с помощью Arrays.toString


    }


}
