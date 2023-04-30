package com.sefanebi.playbook.collections;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> ints = List.of(20, 30, 40, 40, 50, 50);

        Set<Integer> intSet = new LinkedHashSet<>(ints);
        System.out.println(intSet);

        List<Person> personList = new ArrayList<>(List.of(new Person("Jon"), new Person("Jon")));
        Set<Person> personSet = new HashSet<>(personList);
        System.out.println(personSet);

    }

    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
