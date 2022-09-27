package com._8kyu;

public class ReversedStrings {

    /*
    Complete the solution so that it reverses the string passed into it.
     */

    public static String solution(String str) {
        // Your code here...
        StringBuilder strb = new StringBuilder(str);
        return strb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("world"));
    }
}
