package com.sefanebi.playbook.io;

import java.nio.file.Path;

public class GetCurrentDirectory {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));

        System.out.println(Path.of("").toAbsolutePath());

    }
}
