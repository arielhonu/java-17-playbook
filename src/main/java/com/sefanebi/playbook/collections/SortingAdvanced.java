package com.sefanebi.playbook.collections;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.Comparator.nullsLast;

public class SortingAdvanced {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>(Arrays.asList(
                new Person("Jake", 28),
                new Person("Don", 30),
                new Person("Andy", 40),
                new Person("John", 36),
                new Person("John", 35)
        ));

//        personList.sort(String::compareTo);
//        personList.sort(Person::name);

        personList.sort(comparing(Person::age));
        System.out.println("Compared by age: " + personList);

        personList.sort(comparing(Person::name));
        System.out.println("Compared by name" + personList);

        personList.sort(comparing(Person::name).reversed());
        System.out.println("Reversed by name: " + personList);

        personList.sort(comparing(Person::age).thenComparing(Person::age));
        System.out.println("By age then by name: " + personList); // default behavior - can be overridden by overriding equals and hashCode methods

        List<Person> personListWithNulls = new ArrayList<>(Arrays.asList(
                null,
                new Person("Jake", 28),
                new Person("Don", 30),
                new Person("Andy", 40),
                new Person("John", 36),
                new Person("John", 35),
                null
        ));

        personListWithNulls.sort(Comparator.nullsFirst(comparing(Person::name)));
        System.out.println("Nulls first comparison: " + personListWithNulls);

        personListWithNulls.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Person::age))
                .forEach(System.out::println);


        Person[] personArr = {
                null,
                new Person("Jake", 28),
                new Person("Don", 30),
                new Person("Andy", 40),
                new Person("John", 36),
                new Person("John", 35),
                null
        };

        Arrays.sort(personArr, nullsLast(comparing(Person::name).thenComparing(Person::age)));
        System.out.println("Comparing with arrays: " );
        Arrays.stream(personArr).forEach(System.out::println);
    }



    record Person(String name, int age) {
        @Override
        public String toString() {
            return name + "=" + age;
        }
    }
}
