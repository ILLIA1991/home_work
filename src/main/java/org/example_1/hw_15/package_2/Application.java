package org.example_1.hw_15.package_2;


import java.io.File;

public class Application {
    public static void main(String[] args) {
        String path = "src/main/java/org/example_1/hw_15/package_2/example.txt";

        File file = new File(path);


        String path1 = "src/main/java/org/example_1/hw_15/package_1";
        String path2 = "src/main/java/org/example_1/hw_15/package_2/package_3";

        File file1 = new File(path1);
        File file2 = new File(path2);
        file2.mkdir();

        System.out.println(file1.isDirectory());
        System.out.println(file2.isDirectory());



    }
}

