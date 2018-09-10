package edu.just.a;

abstract class A1 {
    void printA1() {
        ite();
    }

    void ite() {
        System.out.println("A1");
    }

}

 abstract class A2 extends A1 {
    void printA2() {

    }

     @Override
     void ite() {
         System.out.println("A2");
     }
 }

class A3 extends A2 {
    public void test() {
        super.printA1();
    }

    @Override
    void ite() {
        System.out.println("A3");
    }
}

public class Main4 {
    public static void main(String[] args) {
        A3 a3 = new A3();
        a3.test();
    }
}
