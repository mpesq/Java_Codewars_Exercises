package com._6kyu;

public class CamelCasing {
    public static String camelCase(String input) {
        return input.replaceAll("([A-a])", " $1");
    }

    public static void main(String[] args) {
        System.out.println(camelCase("camelCase"));
    }
}
