package com._7kyu;

import java.util.Arrays;

public class OddOrEven {

    /*
    Given a list of integers, determine whether the sum of its elements is odd or even.

    Give your answer as a string matching "odd" or "even".

    If the input array is empty consider it as: [0] (array with a zero).

    Examples:
    Input: [0]
    Output: "even"

    Input: [0, 1, 4]
    Output: "odd"

    Input: [0, -1, -5]
    Output: "even"
     */
    public static String oddOrEven (int[] array) {
        // your code
        int result = Arrays.stream(array).sum();
        if (result % 2 == 0) return "even";
        else return "odd";

    }

    public static void main(String[] args) {
        int[] datos = {1, 2};
        System.out.println(oddOrEven(datos));
    }
}
