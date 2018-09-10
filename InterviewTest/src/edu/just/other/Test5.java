package edu.just.other;

class Base {
    public void method(){
        System.out.println("base");
    }
}

class Son1 extends Base {
    @Override
    public void method() {
        System.out.println("son");
    }

    public void methodB() {
        System.out.println("sonB");
    }
}

public class Test5 {

    public static void main(String[] args) {
        Base base = new Son1();
        base.method();
        ((Son1)base).methodB();
    }

}
