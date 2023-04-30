package com.sefanebi.playbook.numbers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class RoundingWithDecimalFormatAndBigDecimal {
    public static void main(String[] args) {

        System.out.println("DecimalFormat");
        NumberFormat df = new DecimalFormat("0");

        System.out.println(df.format(1.4));
        System.out.println(df.format(1.6));

        // Banker's rounding - RoundingMode.HALF_EVEN
        System.out.println(df.format(1.5));
        System.out.println(df.format(2.5));

        System.out.println();

        df.setRoundingMode(RoundingMode.HALF_UP);
        System.out.println(df.format(2.5));

        System.out.println("BigDecimal");
        System.out.println(BigDecimal.valueOf(1.5).setScale(2, RoundingMode.HALF_UP));
        System.out.println(BigDecimal.valueOf(2.5).setScale(2, RoundingMode.HALF_UP));

    }

    private static String formatDecimal(double number) {
        NumberFormat df = new DecimalFormat("0");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(number);
    }

    private static double roundBigDecimal(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        return bd.setScale(places, RoundingMode.HALF_UP).doubleValue();
    }
}
