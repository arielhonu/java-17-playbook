package com.sefanebi.playbook.strings;

public class FindAndReplace {
    public static void main(String[] args) {
        findMatches();
        replace();
    }

    public static void findMatches() {
        String str = "Java 17 Recipes!";

        System.out.println(str.matches("Java 17 Recipes!"));
        System.out.println(str.matches("Java 17"));

        System.out.println(str.matches("[Jj]ava.*"));
        System.out.println(str.matches("Java [0-9]+ Recipes!"));
    }

    public static void replace() {
        String str = "11 Recipes for Java 11";
        System.out.println(str.replace("11", "17")); // replaces all, but takes a char sequence
        System.out.println(str.replaceAll("11", "17")); // replaces all, but takes a regex
        System.out.println(str.replaceFirst("11", "17"));
    }
}
