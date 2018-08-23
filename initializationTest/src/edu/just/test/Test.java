package edu.just.test;

class AA {

    static int b;

    static {
        b = 1000;
        System.out.println("static b " + b);
    }

    {
        b = 1001;
        System.out.println("code b " + b);
    }

    AA() {
        b = 1002;
        System.out.println("constructor b " + b);
    }

}

public class Test extends AA {

    static int a;

    static {
        a = 1000;
        System.out.println("static a " + a);
    }

    {
        a = 1001;
        System.out.println("code a " + a);
    }

    Test() {
        this(10);
        a = 1002;
        System.out.println("constructor a " + a);
    }

    Test(int b) {
        System.out.println("constructor a b ");
    }

    public static void main(String[] args) {
        new Test();
    }

}
