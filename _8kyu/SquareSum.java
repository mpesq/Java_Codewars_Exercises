package com._8kyu;

public class SquareSum {
    /*
    Complete the square sum function so that it squares each number passed into it and then sums the results together.

    For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
     */
    public static int squareSum(int[] n) {
        //Your Code
        int suma = 0;
        for(int i : n) {
            suma += Math.pow(i, 2);
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 2};
        System.out.println(squareSum(num));
    }
}
