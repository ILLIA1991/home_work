package trenning.array;

import java.util.Arrays;

public class SortExample {

    public static void main(String[] args) {

        int[] myArray = new int[] {17, 0, 12, 3, -2};

        System.out.println(Arrays.toString(myArray));

        Arrays.sort(myArray);

        System.out.println(Arrays.toString(myArray));

        int index = Arrays.binarySearch(myArray, -2);
        System.out.println(index);


    }
}
