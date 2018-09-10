package edu.just.inherit;

class Animal1 {
    public void name() {
        System.out.println("this is animal");
    }
}

class Dog extends Animal1 {
    public void name() {
        System.out.println("this is dog");
    }

    public void run() {
        System.out.println("dog run");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal1 animal1 = new Dog();
//        animal1.name();
//        animal1.run();

        /*Dog dog = (Dog) animal1;
        dog.name();
        dog.run();*/

        Animal1 animal11 = new Animal1();
        Dog dog1 = (Dog) animal11;
        dog1.name();
        dog1.run();

        Dog d = (Dog) new Animal1();
    }
}
