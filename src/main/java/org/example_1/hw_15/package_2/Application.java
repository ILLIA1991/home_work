package org.example_1.package_1.package_2;

import com.sun.nio.sctp.PeerAddressChangeNotification;

import java.io.File;

public class Application {
    public static void main(String[] args) {
        String path = "src/main/java/org/example_1/package_1/package_2/example.txt";
        File file = new File(path);
        String path1 = "src/main/java/org/example_1/package_1/package_1";
        String path2 = "src/main/java/org/example_1/package_1/package_2";
        Package package = new Package(path1);
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isDirectory());
    }
}
