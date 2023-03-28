package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {
    private int speed;

    public Audi(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        System.out.println("Audi is going " + " mph");
        return speed;
    }

    public double increaseSpeed() {
        return (speed + 10);
    }

    public double decreaseSpeed() {
        return (speed - 8);
    }
}

