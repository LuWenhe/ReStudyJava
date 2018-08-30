package edu.just.string;

class A {
    public A(String str){

    }
}

public class StringTest {

    public static void main(String[] args) {
        A a = new A("aa");
        A b = new A("aa");
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

}
