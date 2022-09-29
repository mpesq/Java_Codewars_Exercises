package com._7kyu;

import java.util.Arrays;

public class HighestAndLowest {
    /*
    In this little assignment you are given a string of space separated numbers,
    and have to return the highest and lowest number.

    Examples
    highAndLow("1 2 3 4 5")  // return "5 1"
    highAndLow("1 2 -3 4 5") // return "5 -3"
    highAndLow("1 9 3 4 -5") // return "9 -5"

    Notes
    All numbers are valid Int32, no need to validate them.
    There will always be at least one number in the input string.
    Output string must be two numbers separated by a single space, and highest number is first.
     */

    public static String highAndLow(String numbers) {
        String[] numbersParts = numbers.split(" ");
        int values[] = Arrays.stream(numbersParts).mapToInt(Integer::parseInt).toArray();
        int highest = values[0];
        int lowest = values[0];
        for (int x : values) {
            if (x > highest) highest = x;
        }
        for (int x : values) {
            if (x < lowest) lowest = x;
        }

        return highest + " " + lowest;

        /*
        Also you can do:
        var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        return stats.getMax() + " " + stats.getMin();
         */
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("1 9 3 4 -5"));
    }
}

