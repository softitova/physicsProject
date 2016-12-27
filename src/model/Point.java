package model;

/**
 * Created by vadim on 28.11.16.
 */
public class Point {
    public double x, y;

    public Point() {}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{x=" + x + ", y=" + y + "}";
    }


    public Point add(Point other) {
        return new Point(x + other.x, y + other.y);
    }

    public Point minus(Point other) {
        return new Point(x - other.x, y - other.y);
    }

    public Point rotate(double cos, double sin) {
        return new Point(x * cos + y - sin, x * sin + y * cos);
    }

    public double norm() {
        return Math.sqrt(x * x + y * y);
    }
}
