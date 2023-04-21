package com.example.javaprojtectest2.spaceInvador;

public class SpaceInvader_static {
    int location = 0;

    private void moveLeft() {
        location += -1;
        System.out.println("moveLeft location = " + location);
    }

    private void moveRight() {
        location += 1;
        System.out.println("moveRight location = " + location);
    }

    public static void main(String[] args) {
        SpaceInvader_static si = new SpaceInvader_static();
        si.moveLeft();
        si.moveRight();
        si.moveRight();
        si.moveRight();
        si.moveRight();
    }
}
