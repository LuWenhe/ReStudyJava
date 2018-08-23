package edu.just.order;

class A {
    static {
        System.out.println("A 基类静态域");
    }

    {
        System.out.println("A 基类对象成员构造函数");
    }

    public A() {
        System.out.println("A 基类本身构造函数");
    }
}

class B extends A {
    static  {
        System.out.println("B 派生类静态域");
    }

    {
        System.out.println("B 派生类对象成员构造函数");
    }

    public B() {
        System.out.println("B 派生类本身构造函数");
    }

}

public class FuntionOreder {

    public static void main(String[] args) {
        A a = new B();

    }

}
