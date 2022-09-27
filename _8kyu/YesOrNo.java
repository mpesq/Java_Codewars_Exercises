package com._8kyu;

public class YesOrNo {

    //Convert boolean values to strings 'Yes' or 'No'.
    public static String boolToWord(boolean b)
    {
        //TODO
        if(b) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        System.out.println(boolToWord(true));
        System.out.println(boolToWord(false));
    }
}
