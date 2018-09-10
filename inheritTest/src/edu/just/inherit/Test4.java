package edu.just.inherit;

class Car {
    public String name = "Car";
}

class Benz extends Car {
    public String name = "Benz";
}

public class Test4 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.name);

        Car car1 = new Benz();
        System.out.println(car1.name);
    }
}
