package test;

import circles.Circle;

public class SubCircle extends Circle {
    public SubCircle(double radius) {
        super(radius);
    }
    public void showInfo() {
        System.out.println("Radius: " + getRadius());
        System.out.println("Area: " + getArea());
    }

}
