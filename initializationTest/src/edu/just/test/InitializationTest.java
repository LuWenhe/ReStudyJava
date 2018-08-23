package edu.just.test;

public class InitializationTest {

    static int a;

    static {
        a = 100000;
        System.out.println("static " + a);
    }

    {
        a = 1000;
        System.out.println(".." + a);
    }

    void print() {
        a = 1001;
        System.out.println("print..." + a);
    }

    public static void main(String[] args) {
        new InitializationTest().print();
        System.out.println(a);
    }

}
