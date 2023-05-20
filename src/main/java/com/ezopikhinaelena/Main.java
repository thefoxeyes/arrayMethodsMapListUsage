package com.ezopikhinaelena;

public class Main {
    public static void main(String[] args) {
        ArrayInstance obj1 = new ArrayInstance();
        obj1.sortMassive();

        CollectionsInstance obj2 = new CollectionsInstance();
        obj2.sortCollection();
        obj2.searchIndex();

        MapInstance obj3 = new MapInstance();
        obj3.sortMap();
        obj3.compareMap();
    }
}
