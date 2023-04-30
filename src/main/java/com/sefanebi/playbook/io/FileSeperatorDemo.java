package com.sefanebi.playbook.io;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileSeperatorDemo {

    static String filePath = "src/main/resources/modules.txt";
    static String filePath2 = "src\\main\\resources\\modules.txt";
    public static void main(String[] args) {

        System.out.println(Files.exists(Path.of(filePath)));
        System.out.println(Files.exists(Path.of(filePath2)));
        System.out.println(Files.exists(Path.of("src", "main", "resources", "modules.txt")));

    }
}
