package com.dmdev.assignment1;

import java.util.Scanner;


/**
 * Имеются три числа - день, месяц и год, вводимые пользователем с консоли
 * Вывести дату следующего дня в формате День.Месяц.Год
 * Учесть переход на следующий месяц, а также следующий год.
 * Форматирование строки "День.Месяц.Год" вынести в отдельную функцию

 * Искал как вывести два корня квадратного уравнения из функции и нашел array.
 * Попробовал использовать больше, чем в одном месте
 */
public class DayMonthYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day: ");
        int day = scanner.nextInt();

        System.out.println("Input month: ");
        int month = scanner.nextInt();

        System.out.println("Input year: ");
        int year = scanner.nextInt();


        if (!((year >= 0) && (month >= 1 && month <= 12) && (day >= 1 && day <= setFinalDay(month, year)))) {
            System.out.println("Date is not valid");
        } else if (day == 31 && month == 12) {
            day = 1;
            month = 1;
            year ++;
            System.out.println(returnDate(day, month, year));
        } else {
            int [] result = dayIncrement(day, month, year);
            day = result[0];
            month = result[1];
            System.out.println(returnDate(day, month, year));
        }
    }

    public static boolean isLeapYear (int year_number) {
// takes year as parameter and returns true if given year is leap, false otherwise
        return (year_number % 4 == 0 && year_number % 100 != 0) || year_number % 400 == 0;
    }

    public static int setFinalDay (int month_number, int year_number) {
// takes month and year as parameters and returns number of days in a given month
        if (month_number == 4 || month_number == 6 || month_number == 9 || month_number == 11) {
            return 30;
        } else if (month_number == 2 && isLeapYear(year_number)) {
            return  29;
        } else if (month_number == 2 && !isLeapYear(year_number)) {
            return 28;
        } else {
            return 31;
        }
    }

    public static int [] dayIncrement (int day_number, int month_number, int year_number) {
// takes int day, month and year as parameters and returns array of integers day and month
        int testValue = setFinalDay(month_number, year_number);
        if (day_number < testValue) {
            day_number ++;
        } else {
            day_number = 1;
            month_number ++;
        }
        int [] dayAndMonth = {day_number, month_number};
        return dayAndMonth;
    }

    public static String returnDate (int day_number, int month_number, int year_number) {
// takes int day, month and year as parameters and returns formatted string
        String [] monthsLiterals = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        String monthString = monthsLiterals[month_number - 1];
        String finalDate = "Next day is: " + day_number + " " + monthString + " " + year_number;
        return finalDate;
    }
}
