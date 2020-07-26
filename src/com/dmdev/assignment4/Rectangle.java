package com.dmdev.assignment4;

public class Rectangle {

    private Point topLeftPoint;
    private Point bottomRightPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    private int calculateLength() {
        return bottomRightPoint.getxCoordinate() - topLeftPoint.getxCoordinate();
    }

    private int calculateWidth() {
        return topLeftPoint.getyCoordinate() - bottomRightPoint.getyCoordinate();
    }

    /**
     * Returns Area of a given rectangle
     */
    public double calculateArea() {
        return this.calculateLength() * this.calculateWidth();
    }

    /**
     * Returns length of diagonal of a given rectangle
     */
    public double calculateDiagonal() {
        return Math.sqrt(Math.pow(this.calculateLength(), 2) + Math.pow(this.calculateWidth(), 2));
    }
}
