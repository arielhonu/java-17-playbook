package com.sefanebi.playbook.io;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileToPathConversion {

    static String filePath = "src/main/resources/modules.txt";
    public static void main(String[] args) {

        File file = new File(filePath);
        System.out.println(file.exists());

        Path path = Path.of(filePath);
        System.out.println(Files.exists(path));

        Path path2 = file.toPath();
        System.out.println(Files.exists(path2));
    }
}
