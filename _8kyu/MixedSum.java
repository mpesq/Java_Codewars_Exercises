package com._8kyu;

import java.util.Arrays;
import java.util.List;

public class MixedSum {
    /*
     * Assume input will be only of Integer o String type
     */
    public static int sum(List<?> mixed) {
        int suma = 0;
        for(Object item : mixed) {
            if(item instanceof Integer) {
                suma += (Integer) item;
            }else{
                suma += Integer.parseInt((String) item);
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2);
        System.out.println(sum(list));
    }
}
