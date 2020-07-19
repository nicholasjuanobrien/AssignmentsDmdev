package com.dmdev.assignment2;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую и отображающую все числа Фибоначчи
 * меньше введённого пользователем целого числа.
 *
 * !!! Первую задачу про сумму цифр в числе нет, потому что она решена
 * в видео 6.3
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = scanner.nextInt();
        getFibonacciIteration(number);
    }

    public static void getFibonacciIteration(int value) {
        int fib1 = 0;
        int fib2 = 1;
        int result = fib1;
        if (value < fib1) {
            System.out.println("Number should be positive");
        } else {
            while (result < value) {
                System.out.println(result);
                result = fib1 + fib2;
                fib1 = fib2;
                fib2 = result;
            }
        }
    }
}