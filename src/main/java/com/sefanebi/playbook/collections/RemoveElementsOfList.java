package com.sefanebi.playbook.collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsOfList {
    public static void main(String[] args) {
        List<Integer> ints = List.of(20, 30, 40, 50);
//        ints.remove(1); // UnsupportedOperationException

        List<Integer> ints2 = new ArrayList<>(ints);
        ints2.removeIf(i -> i < 40);
        System.out.println(ints2);

        List<String> strings = new ArrayList<>(List.of("Marie", "Jake", "Jon", "Sarah"));
        strings.removeIf( s -> s.endsWith("ie"));
        System.out.println(strings);

        strings.removeAll(List.of("Jake", "Jon"));
        System.out.println(strings);

        List<Person> personList = new ArrayList<>(List.of(new Person("Jon"), new Person("Andrew")));
        personList.removeIf(p -> p.name().equalsIgnoreCase("Andrew"));
        System.out.println(personList);
    }

    record Person(String name) {}
}
