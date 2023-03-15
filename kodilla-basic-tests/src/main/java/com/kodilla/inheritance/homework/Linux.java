package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {
    public void turnOn() {
        System.out.println("Linux system is enabled");
    }

    public void turnOff() {
        System.out.println("Linux system is disabled");
    }

    public Linux(int years) {
        System.out.println("Linux was created in 1991");
    }
}