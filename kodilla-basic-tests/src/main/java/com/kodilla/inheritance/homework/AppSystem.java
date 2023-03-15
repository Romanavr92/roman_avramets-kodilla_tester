package com.kodilla.inheritance.homework;

public class AppSystem {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem();


        Windows windows = new Windows();
        windows.turnOn();


        Linux linux = new Linux();
        linux.turnOff();

    }
}
