package com._6kyu;

/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing.
The first word within the output should be capitalized only if the original word was capitalized
(known as Upper Camel Case, also often referred to as Pascal case).

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 */

import java.lang.StringBuilder;

public class StringToCamelCase {

    public static String toCamelCase(String s) {
        StringBuilder strb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '-' || s.charAt(i) == '_') {
                i++;
                if(Character.isUpperCase(s.charAt(i))) {
                    strb.append(s.charAt(i));
                    continue;
                } else {
                    strb.append(Character.toUpperCase(s.charAt(i)));
                    continue;
                }
            }
            strb.append(s.charAt(i));
        }
        return strb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("The_Stealth_warrior"));
    }
}
