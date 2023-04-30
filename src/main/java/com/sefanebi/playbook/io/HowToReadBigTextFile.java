package com.sefanebi.playbook.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HowToReadBigTextFile {
    public static void main(String[] args) {

    }

    public static String readWithBufferedREaderOldWay(String path) {
        BufferedReader objReader = null;
        StringBuilder fileContent = new StringBuilder();
        try {
            String strCurrentLine;
            objReader = new BufferedReader(new FileReader(path));
            while ((strCurrentLine = objReader.readLine()) != null) {
                fileContent.append(strCurrentLine).append(" ");
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        } finally {
            if (objReader != null) {
                try {
                    objReader.close();
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
        }
        return fileContent.toString();
    }

    public static void printWithBufferedReaderNewWay(String path) {
        try (BufferedReader br = Files.newBufferedReader(Path.of(path))) {
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static void printWithStream(String pathToFile) {
        try (Stream<String> lines = Files.lines(Path.of(pathToFile))) {
            lines.forEach(System.out::println);
//            return lines.collect(Collectors.joining(" "));
//            return lines.toList();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
