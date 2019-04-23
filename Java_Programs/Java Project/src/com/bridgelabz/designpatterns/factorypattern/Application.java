package com.bridgelabz.designpatterns.factorypattern;

public class Application
{
    public static void main(String[] args) {

        //requests for circle shape

        GeometricShape circle = ShapeFactory.getShape(ShapeType.RECTANGLE);
        if (circle != null) {
            circle.draw();
        } else {
            System.out.println("This shape can not be drawn.");
        }
        //requests non existent shape
        GeometricShape triangle = ShapeFactory.getShape(ShapeType.TRIANGLE);
        if (triangle != null) {
            triangle.draw();
        } else {
            System.out.println("This shape can't be drawn");
        }
    }
}
