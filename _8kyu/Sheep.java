package com._8kyu;

public class Sheep {
    /**
     * Given a non-negative integer, 3 for example,
     * return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
     * Input will always be valid, i.e. no negative integers.
     * @param num
     * @return
     */
    public static String countingSheep(int num) {
        //Add your code here
        String sheeps = "";
        for(int i = 1; i <= num; i++) {
            sheeps += i + " sheep...";
        }
        return sheeps;
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }
}
