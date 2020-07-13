package com.dmdev.assignment1;

import java.util.Scanner;
import java.lang.Math;

/**
 Написать программу, вычисляющую корни квадратного уравнения вида ax ² + bx + c = 0,
 где a, b и c - вводимые пользователем из консоли данные.
 Учитывать только реальные корни (в случае отрицательного  дискриминанта выводить сообщение пользователю).
 При решении создать и использовать следующие вынесенные функции:
 - функция isPositive, определяющая, является ли число  положительным
 - функция isZero, определяющая, является ли число нулём
 - функция discriminant, вычисляющая дискриминант
 */
public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = scanner.nextDouble();

        System.out.println("Enter b");
        double b = scanner.nextDouble();

        System.out.println("Enter c");
        double c = scanner.nextDouble();

        double [] roots = solveEquation(a, b, c);

        returnEquationRoots(roots);
    }

    public static double discriminant (double a, double b, double c) {
// takes a, b and c coefficients as parameters and returns discriminant of quadratic equation
        return Math.pow(b, 2) - (4 * a * c);
    }

    public static boolean isPositive(double number) {
        return number > 0;
    }

    public static boolean isZero (double number) {
        return number == 0;
    }

    public static double [] solveEquation(double a, double b, double c) {
// takes a, b and c coefficients as parameters and returns array of roots of quadratic equations
        double discriminant = discriminant(a, b, c);
        if (isPositive(discriminant)) {
            double firstValue = (- b + Math.sqrt(discriminant)) / (2 * a);
            double secondValue = (-b - Math.sqrt(discriminant)) / (2 * a);
            double [] equationRoots = {firstValue, secondValue};
            return equationRoots;
        } else if (isZero(discriminant)) {
            double firstValue = - b / (2 * a);
            double [] equationRoots = {firstValue};
            return equationRoots;
        } else {
            double [] equationRoots = {};
            return equationRoots;
        }
    }

    public static void returnEquationRoots(double [] equationRoots) {
// takes array of equation roots as parameters and returns formatted answer string
        if (equationRoots.length == 0) {
            System.out.println("Discriminant is negative - no real roots");
        } else if (equationRoots.length == 2){
            System.out.println("Roots of equation: " + equationRoots[0] + ", " + equationRoots[1]);
        }else {
            System.out.println("Roots of equation: " + equationRoots[0]);
        }
    }
}
