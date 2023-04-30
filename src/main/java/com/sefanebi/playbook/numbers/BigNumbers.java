package com.sefanebi.playbook.numbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {

        int maxInt = 2147483647;

        long maxLong = 9223372036854775807L;

        BigInteger bi = new BigInteger("922337203685477580888");

        BigDecimal bd = new BigDecimal("555555555555555555555555555555555555555555.5");
        BigDecimal result = bd.add(new BigDecimal("1"));
        System.out.println(result);
    }
}
