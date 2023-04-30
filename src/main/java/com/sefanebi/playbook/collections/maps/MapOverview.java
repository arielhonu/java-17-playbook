package com.sefanebi.playbook.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MapOverview {
    public static void main(String[] args) {
        Map<Integer, String> immutable = Map.of(
                1, "Java",
                2, "C#",
                3, "JavaScript",
                4, "JavaScript"
        );

        Map<Integer, String> mutableMap = new HashMap<>(Map.of(
                1, "Java",
                2, "C#",
                3, "JavaScript",
                4, "JavaScript"
        ));

        System.out.println(immutable.entrySet());

        System.out.println(immutable.keySet());

        System.out.println(immutable.values());
    }
}
