package edu.just.other;

class A {
    A(){
        System.out.println("A...");
    }
}

class B {
    B(){
        System.out.println("B...");
    }
}

class C extends B{
    C(){
        System.out.println("C...");
    }
}

public class Test {

    public static void main(String[] args) {
        A c = new C();
    }

}
