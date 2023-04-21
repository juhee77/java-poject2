package com.example.javaprojtectest2.spaceInvador;

public class Point {
    int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isSameXy(){
        return x == y;
    }

    public double getDistance(Point point){
        return Math.sqrt(Math.pow(this.x - point.x,2) + Math.pow(this.y - point.y,2));
    }
}
