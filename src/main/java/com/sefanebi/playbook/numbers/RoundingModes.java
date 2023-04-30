package com.sefanebi.playbook.numbers;

public class RoundingModes {

    public static void main(String[] args) {

        // don't do this
        int truncated = (int) 4.6;
        System.out.println(truncated);

        System.out.println("Ceil-floor");
        System.out.println(Math.ceil(4.1));
        System.out.println(Math.floor(4.9));

        System.out.println(Math.ceil(-4.1));
        System.out.println(Math.floor(-4.9));

        System.out.println();

        System.out.println("Round()");
        System.out.println(Math.round(4.5));
        System.out.println(Math.round(4.4));

        System.out.println(Math.round(-1.1));
        System.out.println(Math.round(-2.5));
    }
}
