package com.ezopikhinaelena;

import java.util.*;

public class MapInstance {
    public void sortMap() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(15, 21);
        map.put(9, 5);
        map.put(8, 16);

        List<Integer> mapKeys = new ArrayList<>(map.keySet());
        Collections.sort(mapKeys);
        System.out.println(mapKeys);

        List<Integer> mapValues = new ArrayList<>(map.values());
        Collections.sort(mapValues);
        System.out.println(mapValues);
    }
    public void compareMap() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(15, 21);
        map.put(9, 5);
        map.put(8, 16);
        map.get(15);
        map.get(9);

        System.out.println(Integer.compare(map.get(15), map.get(9)));
    }
}
