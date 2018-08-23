package edu.just.this1;

class Peeler {

    public static Apple peel(Apple apple) {
        return apple;
    }
}

class Apple {

    public Apple getPeeled() {
        return Peeler.peel(this);
    }
}

class Person {
    public void eat(Apple apple) {
        Apple peel = apple.getPeeled();
        System.out.println("yummy");
    }
}

public class PassingThis {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Person person = new Person();
        person.eat(apple);
    }

}
