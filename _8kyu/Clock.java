package com._8kyu;

public class Clock {

    /**
     * Your task is to write a function which returns the time since midnight in milliseconds.
     * @param h
     * @param m
     * @param s
     * @return
     */
    public static int Past(int h, int m, int s) {
        //Happy Coding! ^_^
        int result = 0;
        if(h >= 0 && h <= 23) result += (h * 3600000);
        if(m >= 0 && m <= 59) result += (m * 60000);
        if(s >= 0 && s <= 59) result += (s * 1000);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Past(0, 1, 1));
    }
}
