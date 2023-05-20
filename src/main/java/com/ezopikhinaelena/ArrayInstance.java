package com.ezopikhinaelena;


import java.util.Arrays;

public class ArrayInstance {

    public void sortMassive() {
        int[] intArray = new int[4];
        intArray[0] = 3;
        intArray[1] = 2;
        intArray[2] = 6;
        intArray[3] = 0;

        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
