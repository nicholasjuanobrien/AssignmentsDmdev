package com.dmdev.assignment3;

import java.util.Arrays;

/**
 * Заданы 2 массива целых чисел произвольной длины.
 * Написать программу, создающую третий массив, представляющий собой слияние 2-х заданных.
 * Пример:
 * 1-й массив: {1, 2, 3, 4, 5}
 * 2-й массив: {5, 6, 7}
 * Результат: {1, 5, 2, 6, 3, 7, 4, 5}
 */

public class ArrayConcatenation {

    public static void main(String[] args) {
        int [] array1 = {1, 2, 7};
        int [] array2 = {5, 6, 3, 4, 5};
        combineArrays(array1, array2);
    }

    public static void combineArrays (int [] array1, int [] array2) {
        int arrayLength = array1.length + array2.length;
        int [] resultArray = new int [arrayLength];
        int commonLength = Math.min(array1.length, array2.length);
        int count = 0;
        for (int i = 0; i < commonLength; i++) {
            resultArray[count] = array1[i];
            count +=2;
        }
        int count1 = 1;
        for (int i = 0; i < commonLength; i++) {
            resultArray[count1] = array2[i];
            count1 +=2;
        }
        if (array1.length > array2.length) {
            System.arraycopy(array1, commonLength, resultArray,
                    commonLength * 2, array1.length - commonLength);
        } else {
            System.arraycopy(array2, commonLength, resultArray,
                    commonLength * 2, array2.length - commonLength);
        }
        System.out.println(Arrays.toString(resultArray));
    }
    
}
