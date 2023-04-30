package com.sefanebi.playbook.collections.maps;

import java.util.*;

public class MapFindDuplicateValues {
    public static void main(String[] args) {

        Map<Integer, String> map = Map.of(
                1, "Java",
                2, "C#",
                3, "C#",
                4, "JavaScript",
                5, "JavaScript"
        );

        System.out.println(mapHasDuplicates(map));

        System.out.println(collectDuplicateValues(map));
    }

    private static <K, V> List<V> collectDuplicateValues(Map<K, V> map) {
        return map.values().stream()
                .filter(value -> Collections.frequency(map.values(), value) > 1)
                .distinct()
                .toList();
    }

    private static <K, V> boolean mapHasDuplicates(Map<K, V> map) {
        Collection<V> valuesList = map.values();
        Set<V> valuesSet = new HashSet<>(valuesList);
        return valuesList.size() != valuesSet.size();
    }
}
