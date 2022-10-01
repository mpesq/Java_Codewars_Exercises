package com._8kyu;

public class ReversedArrayOfDigits {
    /*
    Convert number to reversed array of digits
    Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

    Example(Input => Output):
    35231 => [1,3,2,5,3]
    0 => [0]
     */

    public static int[] digitize(long n) {
        // Code here
        
        String numberString = "" + n;
        StringBuilder stringBuilder = new StringBuilder(numberString);
        numberString = stringBuilder.reverse().toString();
        int[] result = new int[numberString.length()];
        for(int i = 0; i < numberString.length(); i++) {
            result[i] = Integer.parseInt(String.valueOf(numberString.charAt(i)));
        }
        return result;
    }

    public static void main(String[] args) {

        int[] numeros = digitize(35231);
        for (int n : numeros) {
            System.out.println(n);
        }
    }
}
