package com.dmdev.assignment2;

import java.util.Scanner;

/**
 * Написать программу, отображающую статистику по осадкам за N дней.
 * N вводится пользователем. Пользователь также должен ввести N целых чисел, обозначающих
 * величину осадков в день.
 *     Программа должна выводить:
 * a. Количество дней
 * b. Сумму осадков за этот период
 * c. Среднее количество осадков за этот период
 * d. Максимальное количество дневных осадков за этот период
 *     Не использовать массивы!
 *
 *     Без массивов не смог вынести логику из main
 */

public class Rainfall {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of days: ");
        int days = scanner.nextInt();
        int count = 1;
        int rainfallSum = 0;
        int maxRainfall = 0;

        while (count <= days) {
            System.out.println("Input number of rainfall: ");
            int rainfall = scanner.nextInt();
            rainfallSum += rainfall;
            count++;
            if (rainfall > maxRainfall) {
                maxRainfall = rainfall;
            }
        }
        double rainfallAverage = (double)rainfallSum/days;

        System.out.println("Number of days " + days + "\n"
                 + "Total rainfall " + rainfallSum + "\n"
                 + "Average rainfall " + rainfallAverage + "\n"
                 + "Maximum rainfall " + maxRainfall);
    }
}