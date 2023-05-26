package com.example.javaprojtectest2.week6.day5;

public class Circle implements Shape {
    private final double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
