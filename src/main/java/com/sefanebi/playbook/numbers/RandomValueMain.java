package com.sefanebi.playbook.numbers;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomValueMain {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextInt());
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(7, 11));

        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());

        System.out.println("\nThreadLocalRandom ");


        var threadSafeRandom = ThreadLocalRandom.current();

        System.out.println(threadSafeRandom.nextInt());
        System.out.println(threadSafeRandom.nextInt(5));
        System.out.println(threadSafeRandom.nextInt(7, 11));

        System.out.println(threadSafeRandom.nextBoolean());
        System.out.println(threadSafeRandom.nextDouble());
    }
}
