package com.dmdev.assignment4;

/**
 * Создать класс Point, описывающий точку в двумерных координатах.
 * Полями этого класса должны быть координаты x и y. Класс должен иметь один конструктор,
 * принимающий координаты x и y.
 * Добавьте функционал для получения скрытой информации (координаты точки),
 * а получить её можно только с помощью методов доступа (get/set).
 * Создать метод distance, принимающий объект Point и определяющий расстояние до неё.
 * Используя класс точки, создать класс Rectangle, описывающий прямоугольник.
 * В нём хранятся два поля типа Point - координаты левого верхнего и правого нижнего углов.
 * Создать следующие методы в классе Rectangle:
 * - Высчитывающий площадь прямоугольника
 * - Высчитывающий длину диагонали
 * Написать тестовый класс с методом main программу, демонстрирующим создание объекта класса Rectangle и
 * применение вышеперечисленных методов.
 */


public class RectangleTest {

    public static void main(String[] args) {
        Point leftTop1 = new Point(2, 10);
        Point rightBottom1 = new Point(15, 6);
        System.out.println("Distance from origin: " + Point.distance(leftTop1));

        Point leftTop2 = new Point(1, 5);
        Point rightBottom2 = new Point(5, 3);

        Rectangle testRectangle1 = new Rectangle(leftTop1, rightBottom1);
        Rectangle testRectangle2 = new Rectangle(leftTop2, rightBottom2);
        System.out.println("First Rectangle area: " + testRectangle1.calculateArea() + "\n"
                + "First Diagonal: " + testRectangle1.calculateDiagonal());
        System.out.println("Second Rectangle area: " + testRectangle2.calculateArea() + "\n"
                + "Second Diagonal: " + testRectangle2.calculateDiagonal());
    }
}
