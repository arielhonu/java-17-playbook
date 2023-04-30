package com.sefanebi.playbook.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.Files.readString;

public class CheckAccess {

    static String filePath = "src/main/resources/modules.txt";

    public static void main(String[] args) throws IOException {
        Path file = Path.of(filePath);

        if(isFileAccessible(file)) {
            System.out.println(readString(file));
        } else {
            System.out.println("Do something else");
        }
    }

    public static boolean isFileAccessible(Path file) {
        return Files.isRegularFile(file) && Files.isReadable(file);
    }
}
