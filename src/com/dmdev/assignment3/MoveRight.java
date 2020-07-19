package com.dmdev.assignment3;
/**
 * Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию,
 * и печатает результат.
 * Цикличность означает, что последний элемент массива становится самым первым его элементом.
 */

import java.util.Arrays;

public class MoveRight {

    public static void main(String[] args) {
        int[] array1 = {};
        int [] array2 = moveRightOnce(moveRightOnce(array1));
        System.out.println(Arrays.toString(array2));
    }

    public static int [] moveRightOnce(int[] array) {
        int[] resultArray;
        if (array.length == 0) {
            resultArray = new int[]{};
        } else {
            resultArray = new int[array.length];
            resultArray[0] = array[array.length - 1];
            for (int i = 0; i < array.length - 1; i++) {
                resultArray[i + 1] = array[i];
            }
        }
        return resultArray;
    }
}

