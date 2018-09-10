package edu.just.inherit;

class People {
    public People() {
        System.out.println("people constructor");
    }

    public void print() {
        System.out.println("This is people");
    }
}

class Man extends People {
    public Man() {
        System.out.println("man constructor");
    }

    /*public void print() {
        System.out.println("This is man");
    }*/
}

public class Test2 {
    public static void main(String[] args) {
        /*People people = new People();
        people.print();*/

        Man man = new Man();
        man.print();

        People man1 = new Man();
        man1.print();
    }
}
