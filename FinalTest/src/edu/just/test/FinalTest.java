package edu.just.test;

import java.util.Random;

public class FinalTest {

    private final String b;
    private int a = new Random().nextInt();

    {
        b = "luwenhe";
    }

    /*static {
        b = "ll";
    }*/

    public void printB() {
        System.out.println(b);
    }

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();
        finalTest.printB();
    }

}
