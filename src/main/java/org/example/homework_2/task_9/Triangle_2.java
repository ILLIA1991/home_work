package org.example.homework_2.task_9;

public class Triangle_2 {
    public static void main(String[] args) {
        int i = 4;
        int j = 4;
        for (i = 4; i > 0; i--) {
            if (i == j) {
                System.out.println("   *");
                if (i == j--) {
                    System.out.println("  **");
                    if (i != j) {
                        System.out.println(" ***");
                        break;
                    }
                }
            }
        }
        System.out.println("****");
    }
}

