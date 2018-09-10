package edu.just.clone;

import sun.rmi.runtime.Log;

class Father implements Cloneable {

    public String name;
    public int age;
    public Child child;

    public Father(String name, int age, Child child) {
        this.name = name;
        this.age = age;
        this.child = child;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Child {
    public String name;
    public int age;

    public Child(String name, int age) {
        this.age = age;
        this.name = name;
    }
}

public class TestClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Child child = new Child("xiixi",12);
        Father father = new Father("luwenhe",20,child);
        Father father1 = (Father) father.clone();

        System.out.println(father.child.age);
        System.out.println(father1.child.age);

        father1.child.age = 1000;

        System.out.println(father.child.age);
        System.out.println(father1.child.age);


    }

}
