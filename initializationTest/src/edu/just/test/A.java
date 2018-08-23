package edu.just.test;

interface B {
    int k = 10;
}

public class A implements B {

    public static void main(String[] args) {
        int i;
        A a = new A();
        System.out.println(a.k);
        System.out.println(args.length);
    }

}
