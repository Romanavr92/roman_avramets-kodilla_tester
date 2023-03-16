package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    double a = 4;
    double b =3;
    double c = 2;
    double tArea = a*b*c;
    double tPerimeter = a+b+c;
    public Triangle() {
        super(4,4);
        System.out.println("Area is " +tArea);
        System.out.println("Perimeter is " +tPerimeter);
    }
    @Override
    public void shapeForm() {
        System.out.println("This form is Triangle");
    }
}
