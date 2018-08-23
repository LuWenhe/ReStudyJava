package edu.just.this1;

class A {

    void amethod(){}

    static void astaticMethod(){}
}

public class StaticTest {

    void aa() {}

    static void print(A a) {
        a.amethod();
        A.astaticMethod();
    }

}
