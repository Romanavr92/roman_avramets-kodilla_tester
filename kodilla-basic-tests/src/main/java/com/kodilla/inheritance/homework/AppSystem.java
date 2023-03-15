package com.kodilla.inheritance.homework;

public class AppSystem {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem();


        Windows windows = new Windows(1985);
        windows.turnOn();


        Linux linux = new Linux(1991);
        linux.turnOff();
        

    }
}
