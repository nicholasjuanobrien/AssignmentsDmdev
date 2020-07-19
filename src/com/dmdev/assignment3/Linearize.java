package com.dmdev.assignment3;
/**
 * Написать функцию linearize, которая принимает в качестве параметра
 * двумерный массив и возвращает одномерный массив со всеми элементами двумерного.
 */

import java.util.Arrays;

public class Linearize {

    public static void main(String[] args) {
        int [] [] values2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
       linearize(values2);
    }

    /**
     * Function takes a two-dimensional integer array as parameter and returns length of
     * one-dimensional array that is equal to the number of elements of all arrays in
     * two-dimensional array
     */
    public static int returnLength (int [] [] twoDimensionalArray) {
        int length = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            length += twoDimensionalArray[i].length;
        }
        return length;
    }

    /**
     * Function takes a two-dimensional integer array as parameter and returns one-dimensional
     * array with all elements of the original two-dimensional array
     */
    public static void linearize(int [][] twoDimensionalArray) {
        int length = returnLength(twoDimensionalArray);
        int [] oneDimensionalArray = new int [length];
        int count = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                oneDimensionalArray[count] = twoDimensionalArray[i][j];
                count++;
            }
        }
        System.out.println(Arrays.toString(oneDimensionalArray));
    }
}
