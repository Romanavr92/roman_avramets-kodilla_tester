package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int area;
    private int perimeter;

    public Shape(int area, int perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public int getArea() {
        return area;
    }

    public int getPerimeter() {
        return perimeter;
    }
    public abstract void shapeForm();
}


