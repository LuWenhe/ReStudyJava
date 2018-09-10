package edu.just.inherit;

class Animal {

    public String type = "A";

    public void printOther() {
        System.out.println("This is animal");
    }

    public static void print() {
        System.out.println("This is static animal");
    }
}

class Bird extends Animal {

    public String type = "B";

    public void printOther() {
        System.out.println("This is bird");
    }

    public static void print() {
        System.out.println("This is static bird");
    }
}

public class Test3 {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        System.out.println(animal1.type);
        animal1.printOther();
        animal1.print();

        Animal animal = new Bird();
        System.out.println(animal.type);
        animal.printOther();
        animal.print();

        Bird bird1 = new Bird();
        System.out.println(bird1.type);
        bird1.printOther();
        bird1.print();
    }

}
