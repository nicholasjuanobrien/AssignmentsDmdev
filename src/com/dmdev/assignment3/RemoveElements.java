package com.dmdev.assignment3;
/**
 * Написать программу, удаляющую все повторяющиеся целые числа из массива и печатающую результат.
 * Массив должен использоваться тот же самый.
 * На место удаленных элементов ставить цифру 0.
 */

import java.util.Arrays;

public class RemoveElements {

    public static void main(String[] args) {
        int [] array1 = {2, 2, 3, 1, 5, 3};
        removeDuplicates(array1);
    }

    /**
     * Function takes one-dimensional integer array as parameter and returns an array with 0
     * instead of duplicate values
     */
    public static void removeDuplicates(int [] array) {
        for (int i = 0; i < array.length; i++) {
            int x = i;
            while (x > 0) {
                if (array[i] == array[x-1]) {
                    array[i] = 0;
                }
                x--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
