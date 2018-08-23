package edu.just.overload;

public class OverLoadTest {

    int a;

    OverLoadTest() {
        System.out.println("overload...");
    }

    OverLoadTest(int a1) {
        a = a1;
        System.out.println("overlaod a1...");
    }

    void info() {
        System.out.println("info ...");
    }

    void info(String string) {
        System.out.println("info ... " + string);
    }

    public static void main(String[] args) {
        OverLoadTest overLoadTest = new OverLoadTest(100);
        overLoadTest.info();
        overLoadTest.info("hello");

        new OverLoadTest();
    }

}
