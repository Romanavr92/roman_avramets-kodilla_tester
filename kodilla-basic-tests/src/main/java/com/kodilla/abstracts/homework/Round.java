package com.kodilla.abstracts.homework;

public class Round extends Shape {
    double r = 3;
    double rArea = r*r*3.14;
    double rPerimeter = r*2*3.14;
    public Round() {
        super(4,4);
        System.out.println("Area is " + rArea);
        System.out.println("Perimeter is " + rPerimeter);
    }
    @Override
    public void shapeForm() {
        System.out.println("This form is Round");
    }
}
