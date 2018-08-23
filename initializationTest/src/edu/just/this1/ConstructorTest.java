package edu.just.this1;

public class ConstructorTest {

    int a = 0;
    String s = "s...";

    ConstructorTest(int cons) {
        this("hello");
        a = cons;
        System.out.println("Constructor int " + a);
    }

    ConstructorTest(String ss) {
        System.out.println("Constructor string " + ss);
        s = ss;
    }

    ConstructorTest(String s, int cons) {
        this(cons);
//        this(s);              //call to "this()" must be first statement in constructor body
//        new ConstructorTest(100);
        this.s = s;
        System.out.println("Constructor string int " + s);
    }

    ConstructorTest(int a, int b){
        System.out.println(a + " " + b);
    }

    ConstructorTest() {
        this("h1", 23);
        System.out.println("default constructor (no args)");
    }

    void print() {
//        this(11);
        System.out.println("printCount... " + s);
    }

    void aa() {
//        this(12, 23);
    }

    public static void main(String[] args) {
        ConstructorTest constructorTest = new ConstructorTest();
        constructorTest.print();
    }

}
