package com.sefanebi.playbook.strings;

public class EmptyBlank {
    public static void main(String[] args) {
        System.out.println("isEmpty()");
        System.out.println("".isEmpty());

        System.out.println("\r".isEmpty());
        System.out.println("\u2002".isEmpty());
        System.out.println(" ".isEmpty());

        System.out.println("\r".isBlank());
        System.out.println("\u2002".isBlank());
        System.out.println(" ".isBlank());

    }
}
