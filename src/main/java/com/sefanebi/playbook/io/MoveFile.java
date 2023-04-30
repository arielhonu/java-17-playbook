package com.sefanebi.playbook.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class MoveFile {
    static String resources = "src/main/resources/";

    public static void main(String[] args) throws IOException {

        Files.move(Path.of(resources + "move_me.txt"),
                Path.of(resources + "move_me-new.txt"), StandardCopyOption.REPLACE_EXISTING); // renames the file if a dest directory is not specified
    }
}
