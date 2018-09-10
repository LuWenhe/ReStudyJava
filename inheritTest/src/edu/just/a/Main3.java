package edu.just.a;

public class Main3 {

    class A {
        public void show(A obj) {
            System.out.println("A and A");
        }

        public void show(C obj) {
            System.out.println("A and C");
        }
    }

    class B extends A {
        public void show(B obj) {
            System.out.println("B and B");
        }

        public void show(A obj) {
            System.out.println("B and A");
        }
    }

    class C extends B {}

    public static void main(String[] args) {
        Main3 main3 = new Main3();
        Main3.A a1 = main3.new A();
        Main3.A a2 = main3.new B();
        Main3.B b = main3.new B();
        Main3.C c = main3.new C();
        a1.show(b);
        a1.show(c);
        a2.show(b);
        a2.show(c);
    }

}
