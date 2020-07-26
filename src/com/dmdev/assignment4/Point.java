package com.dmdev.assignment4;

public class Point {

    private int xCoordinate;
    private int yCoordinate;

    public Point(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public int[] getCoordinates() {
        return new int[]{xCoordinate, yCoordinate};
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    /**
     * Takes Point object as an argument
     * Returns a distance between any given Point and origin (0,0)
     */
    public static double distance(Point point) {
        return Math.sqrt(Math.pow(point.getxCoordinate(), 2) + Math.pow(point.getyCoordinate(), 2));
    }
}
