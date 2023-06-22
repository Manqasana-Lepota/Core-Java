package org.datahandlingtechniques;

public class FunctionOverloading {
    public static void area(float side) {
        System.out.println("Area of a square: " + (side * side));
    }
    public static void area(double radius) {
        System.out.println("Area of a circle: " + (3.1415 * radius * radius));
    }
    public static void area(float a, float b) {
        System.out.println("Area of a rectangle: " + (a * b));
    }
    public static void main(String[] args) {
        area(4, 5);
        area(5F);
        area(6D);

    }
}
