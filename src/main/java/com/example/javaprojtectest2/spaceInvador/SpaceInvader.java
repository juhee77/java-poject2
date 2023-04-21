package com.example.javaprojtectest2.spaceInvador;

public class SpaceInvader {
    private void moveLeft() {
        int location = -1;
        System.out.println("moveLeft location = " + location);
    }

    private void moveRight() {
        System.out.println("SpaceInvader.");
        int location = 1;
        System.out.println("moveRight location = " + location);
    }

    public static void main(String[] args) {
        SpaceInvader si = new SpaceInvader();
        si.moveLeft();
        si.moveRight();
    }
}
