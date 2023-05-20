package com.ezopikhinaelena;

import java.util.*;

public class CollectionsInstance {
    public void sortCollection() {
        Set<Integer> settInt = new HashSet<Integer>();
        settInt.add(1);

        List<Integer> listInt = new ArrayList<>(settInt);
        listInt.add(7);
        listInt.add(11);
        listInt.add(3);

        Collections.sort(listInt);
        System.out.println(listInt);
    }
    public void searchIndex() {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(7);
        listInt.add(11);
        listInt.add(3);

        System.out.println("index 11 = " + listInt.indexOf(11));
    }
}
