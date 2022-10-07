package com._7kyu;

public class NthSeries {
    public static String seriesSum(int n) {
        // Happy Coding ^_^
        double result = 0;

        for(int i = 0; i < n; i++) {
            result = (float) (result + (1.0 / (1 + 3 * i)));
        }
        return String.format("%.2f", result);
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }
}


