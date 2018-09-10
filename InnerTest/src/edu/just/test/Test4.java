package edu.just.test;

import edu.just.people.Eat;

class Outer2 {

    public Eat print() {
        class EatTest implements Eat {
            @Override
            public void eat() {
                System.out.println("eat");
            }
        }

        return new EatTest();
    }

}

public class Test4 {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        Eat print = outer2.print();
        print.eat();
    }
}
