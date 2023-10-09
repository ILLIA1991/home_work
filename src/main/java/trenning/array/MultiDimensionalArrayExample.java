package trenning.array;

import java.util.Arrays;

public class MultiDimensionalArrayExample {

    public static void main(String[] args) {

        int[][] twoDimensionalArray = new int[5][3];

        for (int i = 0; i <twoDimensionalArray.length ; i++) {
            int[] ints = twoDimensionalArray[i];
            for (int j = 0; j < ints.length; j++) {
                ints[j] = (int) (Math.random() * 10);

            }
        }
        for (int i = 0; i < twoDimensionalArray.length; i++) {

             System.out.println(Arrays.toString(twoDimensionalArray[i]));
        }
    }
}
