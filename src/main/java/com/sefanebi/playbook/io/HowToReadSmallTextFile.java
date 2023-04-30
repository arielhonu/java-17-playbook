package com.sefanebi.playbook.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class HowToReadSmallTextFile {

    static String filePath = "/src/main/resources/modules.txt";
    public static void main(String[] args) throws IOException {

        System.out.println(readSmallFile(filePath));

        readSmallFile(filePath).lines();

        System.out.println(readLineByLine(filePath));

        readLineByLine(filePath).stream();
    }
    private static String readSmallFile(String pathToFile) throws IOException {
        return Files.readString(Path.of(pathToFile));
    }

    private static List<String> readLineByLine(String pathToFile) throws IOException {
        return Files.readAllLines(Path.of(pathToFile));
    }

}
