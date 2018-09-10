package edu.just.inherit;

class A {
    String name="A";

    public void method() {
        System.out.println("hello A");
    }
}

class B extends A {
    String name="B";

    public void method() {
        System.out.println("hello B");
    }
}

class C extends B {
    String name="C";

    public void method() {
        System.out.println("hello C");
    }
}

public class TestDemo2 {
    public static void main(String[] args) {
        // 编译时类型为A，输出应该是A
        System.out.println("编译时类型为A，输出应该是A");
        A a=new A();
        System.out.println(a.name);
        a.method();

        A ab=new B();
        System.out.println(ab.name);
        ab.method();

        A ac=new C();
        System.out.println(ac.name);
        ac.method();

        // 编译时类型为B，输出应该是B
        System.out.println("编译时类型为B，输出应该是B");
        B b=new B();
        System.out.println(b.name);
        b.method();

        B bc=new C();
        System.out.println(bc.name);
        bc.method();

        // 编译时类型为C，输出应该是C
        System.out.println("编译时类型为C，输出应该是C");
        C c=new C();
        System.out.println(c.name);
        c.method();
    }
}
