package edu.just.inherit;

class Shape {
    public static String name = "shape";

    public Shape() {
        System.out.println("shape constructor");
    }

    public void printType() {
        System.out.println("this is shape");
    }

    public static void printName() {
        System.out.println("shape");
    }
}

class Circle extends Shape {
    public static String name = "circle";

    public Circle() {
        System.out.println("circle constructoe");
    }

    public void printType() {
        System.out.println("this is circle");
    }

    public static void printName() {
        System.out.println("circle");
    }
}

class Rectangle extends Circle {
    public String name = "rectangle";
}

public class Test {

    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println("name is: " + circle.name);
        circle.printType();
        circle.printName();

        System.out.println();

        Shape shape = new Circle();
        System.out.println("name is: " + shape.name);
        shape.printType();
        shape.printName();

        System.out.println();

        Shape shape1 = new Rectangle();
        System.out.println("name is: " + shape1.name);
    }

}
