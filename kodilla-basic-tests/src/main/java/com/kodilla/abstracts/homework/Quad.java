package com.kodilla.abstracts.homework;

public class Quad extends Shape {
    double a = 5;
    double b = 4;
    double qArea = a*b;
    double qPerimeter= (a+b)*2;
    public Quad() {
        super(4,4);
        System.out.println("Area is " + qArea);
        System.out.println("Perimeter is " +qPerimeter);
    }
    @Override
    public void shapeForm() {
        System.out.println("This form is Quad");
    }
}
