package edu.just.inherit;

class Person {
    public String name;

    public Person() {
        name = "person";
    }

    public void show() {
        System.out.println("person show");
    }
}

class Woman extends Person {
    public String name;

    public Woman() {
        name = "woman";
    }

    public void show() {
        System.out.println("woman show");
    }
}

public class TestDemo {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        person.show();

        System.out.println();

        Person person1 = new Woman();
        System.out.println(person1.name);
        person1.show();

        System.out.println();

        Woman woman = new Woman();
        System.out.println(woman.name);
        woman.show();
    }

}
