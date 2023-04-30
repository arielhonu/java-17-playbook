package com.sefanebi.playbook.strings;

public class RemoveSpaces {
    public static void main(String[] args) {
        System.out.println("hello      ".stripTrailing() + "     there".trim());

        char space = '\u2002';
        System.out.println("\\u2002 is whitespace: " + Character.isWhitespace(space));

        System.out.println("hello\u2002".trim() + "\u2002there".trim());
        System.out.println("hello\u2002".strip() + "\u2002there".strip());
    }
}
