package com.sefanebi.playbook.numbers;

import org.apache.commons.lang3.math.NumberUtils;

public class CheckStringIsNumber {
    public static void main(String[] args) {
        System.out.println(isNumericTryCatch("5"));
        System.out.println(isNumericTryCatch("5a"));

        System.out.println(NumberUtils.isCreatable("Your num"));
    }

    public static boolean isNumericLoop(String s) {
        for (char c : s.toCharArray()){
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }

    public static boolean isNumericTryCatch(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
