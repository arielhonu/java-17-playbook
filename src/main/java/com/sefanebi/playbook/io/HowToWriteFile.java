package com.sefanebi.playbook.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.Instant;
import java.util.List;

public class HowToWriteFile {

    static String filePath = "src/main/resources/write_to_me.txt";

    public static void main(String[] args) throws IOException {

        Files.writeString(Path.of(filePath), "some str\n");

//        Files.writeString(Path.of(filePath), "another str\n", StandardOpenOption.CREATE_NEW);

        Files.writeString(Path.of(filePath), "some str 2\n", StandardOpenOption.APPEND);

        Files.writeString(Path.of(String.format("src/main/resources/write_to_me-%s.txt",
                Instant.now().toString().replace(":", "-"))), "somestr\n");

        Files.writeString(Path.of(filePath), "");

        List<String> strings = List.of("one", "two", "three");
        // NO!
        for(String string : strings) {
            Files.writeString(Path.of(filePath), string + System.lineSeparator(), StandardOpenOption.APPEND);
        }

        // BETTER
        StringBuilder sb = new StringBuilder();
        for(String string: strings) {
            sb.append(string).append(System.lineSeparator());
        }
        Files.writeString(Path.of(filePath), sb.toString(), StandardOpenOption.APPEND);
    }
}
