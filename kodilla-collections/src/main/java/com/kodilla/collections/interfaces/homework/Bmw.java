package com.kodilla.collections.interfaces.homework;

public class Bmw implements Car {
    private int speed;

    public Bmw(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        System.out.println("Bmw is going " + " mph");
        return speed;
    }

    @Override
    public double increaseSpeed() {
        return speed + 12;
    }

    @Override
    public double decreaseSpeed() {
        return speed - 8;
    }
}
