package com.sefanebi.playbook.strings;

public class IterateOverCharacters {
    public static void main(String[] args) {
        String str = "some string";

        for(int i = 0, n = str.length(); i < n; i++){
            char c = str.charAt(i);
            // do things with the char
            System.out.println(c);
        }

        for(char c: str.toCharArray()){
            System.out.println(c);
        }

        System.out.println("Specific char to uppercase: ");
        System.out.println(charToUpperCase(str, 's'));
        System.out.println(charToUpperCase(str, 'g'));
    }

    private static String charToUpperCase(String str, char charToUpper){
        var sb = new StringBuilder();
        for(char c: str.toCharArray()){
            char charToAppend = c == charToUpper ? Character.toUpperCase(c) : c;
            sb.append(charToAppend);
        }
        return sb.toString();
    }
}
