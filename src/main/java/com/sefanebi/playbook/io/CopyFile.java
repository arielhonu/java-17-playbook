package com.sefanebi.playbook.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Instant;

public class CopyFile {

    static String resources = "src/main/resources/";
    static Path filePath = Path.of(resources + "modules.txt");
    static Path filePath2 = Path.of(resources + "modules-copied.txt");

    public static void main(String[] args) throws IOException {

        Files.copy(filePath, filePath2, StandardCopyOption.REPLACE_EXISTING); // Overwrites existing file

        if(!Files.exists(filePath2)) {
            Files.copy(filePath, filePath2);
        } else {
            Files.copy(filePath, Path.of(resources +
                    String.format("modules-copied-%s.txt", Instant.now().toString().replace(":", "-"))));
        }
    }
}
