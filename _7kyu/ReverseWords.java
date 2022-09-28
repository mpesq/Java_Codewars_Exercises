package com._7kyu;

public class ReverseWords {
    /*
    Complete the function that accepts a string parameter, and reverses each word in the string.
    All spaces in the string should be retained.

    Examples
    "This is an example!" ==> "sihT si na !elpmaxe"
    "double  spaces"      ==> "elbuod  secaps"
     */

    public static String reverseWords(final String original) {
        if(original.trim().isEmpty())
        {
            return original;
        }
        String[] originalArray = original.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < originalArray.length; i++) {
            StringBuilder strb = new StringBuilder(originalArray[i]);
            result.append(strb.reverse());
            if(i == originalArray.length -1) continue;
            else result.append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("tu puta"));
    }
}
