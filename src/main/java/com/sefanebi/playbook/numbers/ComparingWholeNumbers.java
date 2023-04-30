package com.sefanebi.playbook.numbers;

public class ComparingWholeNumbers {
    public static void main(String[] args) {
        System.out.println(127 == 127);
        System.out.println(128 == 128);

        System.out.println();

        System.out.println(Integer.valueOf("127").equals(Integer.valueOf("127")));
        System.out.println(Integer.valueOf("128").compareTo(Integer.valueOf("128")));
    }
}
