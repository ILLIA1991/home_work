package org.example_1.hw_15.Butterfly;

public class Butterfly {
    public static void main(String[] args) {

        int size = 18;
        int leftBorder = 1;
        int rightBorder = size;
        int mid = size/2;
        String emptySymbol = " ";


        for (int i = 0; i < mid ; i++) {
            int printingIndex =1;
            for (int j = 1; j < size + 1; j++) {

                if (j <= leftBorder ) {
                    System.out.print(printingIndex);
                } else {
                    if (j < mid) {
                        System.out.print(emptySymbol);
                    } else {
                        if (j < rightBorder) {
                            System.out.print(emptySymbol);
                        } else {
                            System.out.print(printingIndex);
                        }
                    }

                }
                if (j < mid) {
                    printingIndex ++;
                }
                if (j >mid) {
                    printingIndex --;
                }



            }
            System.out.println();
            leftBorder ++;
            rightBorder --;



        }
        for (int i = 0; i < size - 1; i++) {
            int printingIndex = 1;
            mid--;
            for (int j = 1; j < size + 1; j++) {

                if (j <= mid) {
                    System.out.print(printingIndex);
                } else {
                    if (j > leftBorder) {
                        System.out.print(printingIndex);
                        printingIndex--;
                    } else {
                        System.out.print(emptySymbol);
                    }
                }
                if (j < size) {
                    printingIndex++;
                }
                if (j > mid - 1) {
                    printingIndex--;
                }

            }
            System.out.println();
            leftBorder++;
        }
    }
}
