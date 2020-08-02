package com.dmdev.assignment5;

/**
 * Проверить, является ли введённая строка палиндромом, т.е. читается
 * одинаково в обоих направлениях
 */

public class Palindrome {

    public static void main(String[] args) {
        String word = "No lemon, no melon";
        System.out.println(isPalindrome(word));
        System.out.println(isPalindromeStringBuffer(word));
    }

    public static String removePunctuation(String text) {
        String[] punctuation = new String[]{",", ".", "!", "?", ";", ":", " ", "\t", "\n"};
        for (int i = 0; i <= punctuation.length - 1; i++) {
            if (text.contains(punctuation[i])) {
                text = text.replace(punctuation[i], "");
            }
        }
        return text;
    }

    public static boolean isPalindrome(String text) {
        String str = removePunctuation(text.toLowerCase());
        int leftIndex = 0;
        int rightIndex = str.length() - 1;
        while (rightIndex > leftIndex) {
            if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
                return false;
            } else {
                leftIndex++;
                rightIndex--;
            }
        }
        return true;
    }

    public static boolean isPalindromeStringBuffer(String text) {
        String str = removePunctuation(text.toLowerCase());
        return str.equals(new StringBuffer(str).reverse().toString());
    }

}
