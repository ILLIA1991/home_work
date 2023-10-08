package trenning.array;

public class BigOExample {

    public static void main(String[] args) {

        int myInt = 7;
        int myInt2 = 5;

        int sum = sum = sum(myInt, myInt2);
        for (int i = 0; i < 10; i++) {    //o(n) n - колличество элементов в массиве
            System.out.println("h");

        }
    }
    static void printArray(int[] array) {           // o(n) n - колличество элементов в массиве
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
    static void prinArray2 (int[][] array) {   // квадратичная сложность o(n^2) n - колличество элементов в массиве
        for (int i = 0; i < array.length; i++) {
            for (int i1 : array[i]) {
                System.out.println(i1);
            }
            System.out.println(array[i]);

        }
    }

    private static int sum(int arg1, int arg2) {
        return arg1 + arg2;
    }
}
