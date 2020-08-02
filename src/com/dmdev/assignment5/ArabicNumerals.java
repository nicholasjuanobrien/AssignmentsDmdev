package com.dmdev.assignment5;

/**
 * Написать программу, преобразующую строку, содержащую число в римском формате,
 * в число в арабском формате.
 * Границы чисел: от 1 до 3999. Предусмотреть случай, когда меньший символ
 * идёт перед большим: Например CM == 900.
 * Соответствие: M 1000, D 500, C 100, L 50, X 10, V 5, I 1
 */

public class ArabicNumerals {
    public static void main(String[] args) {
        String str = "MMMDCCCXCVII";
        System.out.println(convertToArabic(str));
    }

    public static int convertToArabic(String romanNumeral) {
        return countAll(romanNumeral) - 2 * (subtractIXV(romanNumeral));
    }

    public static int countAll(String romanNumeral) {
        int result = 0;
        for (int i = 0; i <= romanNumeral.length() - 1; i++) {
            if (romanNumeral.charAt(i) == 'M') {
                result += 1000;
            } else if (romanNumeral.charAt(i) == 'D') {
                result += 500;
            } else if (romanNumeral.charAt(i) == 'C') {
                result += 100;
            } else if (romanNumeral.charAt(i) == 'L') {
                result += 50;
            } else if (romanNumeral.charAt(i) == 'X') {
                result += 10;
            } else if (romanNumeral.charAt(i) == 'V') {
                result += 5;
            } else {
                result += 1;
            }
        }
        return result;
    }

    public static int subtractIXV(String romanNumeral) {
        int subtraction = 0;
        for (int i = 0; i <= romanNumeral.length() - 2; i++) {
            if (romanNumeral.startsWith("XC", i) || romanNumeral.startsWith("XL", i)) {
                subtraction += 10;
            } else if (romanNumeral.startsWith("IV", i) || romanNumeral.startsWith("IX", i)) {
                subtraction += 1;
            } else if (romanNumeral.startsWith("CD", i) || romanNumeral.startsWith("CM", i)) {
                subtraction += 100;
            }
        }
        return subtraction;
    }
}
