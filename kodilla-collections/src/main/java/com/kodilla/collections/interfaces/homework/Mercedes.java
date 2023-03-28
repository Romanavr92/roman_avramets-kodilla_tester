package com.kodilla.collections.interfaces.homework;

public class Mercedes implements Car {
    private int speed;

    public Mercedes(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        System.out.println("Mercedes is going " + " mph");
        return speed;
    }

    @Override
    public double increaseSpeed() {
        return speed + 7;
    }

    @Override
    public double decreaseSpeed() {
        return speed - 4;
    }
}

