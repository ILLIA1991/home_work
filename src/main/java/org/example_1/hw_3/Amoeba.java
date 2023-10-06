package org.example_1.hw_3;
// Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//сколько амеб будет через 3, 6, 9, 12,..., 24 часа.


    public class Amoeba {
        public static void main(String[] args) {
            int amoeba = 1;
            for (int i = 0; i <= 24; i = i + 3) {
                amoeba *= 2;
                System.out.println("In " + i + " Остаток -" + " " + amoeba);
            }
        }
    }