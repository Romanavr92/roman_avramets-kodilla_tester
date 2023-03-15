package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public void turnOn() {
        System.out.println("Windows system is enabled");
    }

    public void turnOff() {
        System.out.println("Windows system is disabled");
    }

    public Windows(int years) {
        System.out.println("Windows was created in 1985");
    }
}