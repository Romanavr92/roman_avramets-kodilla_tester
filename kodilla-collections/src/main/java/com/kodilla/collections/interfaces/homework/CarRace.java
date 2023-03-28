package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Audi audi = new Audi(23);
        doRace(audi);
        Mercedes mercedes = new Mercedes(18);
        doRace(mercedes);
        Bmw bmw = new Bmw(25);
        doRace(bmw);
    }

    private static void doRace(Car car) {

        System.out.println(car.increaseSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.decreaseSpeed());
        System.out.println(car.decreaseSpeed());
        System.out.println(car.getSpeed());
    }
}


