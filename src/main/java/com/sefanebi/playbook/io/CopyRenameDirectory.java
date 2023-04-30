package com.sefanebi.playbook.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyRenameDirectory {

    static String dirPath = "copydir/";

    public static void main(String[] args) throws IOException {

        Files.copy(Path.of(dirPath), Path.of("dircopied"));

        Files.delete(Path.of(dirPath));
    }
}
