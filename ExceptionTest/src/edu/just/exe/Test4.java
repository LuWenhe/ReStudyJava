package edu.just.exe;

import java.io.FileNotFoundException;
import java.io.IOException;


class A {
    //非运行时异常
    public void method() throws IOException { }
}

class B extends A {
    @Override
    public void method() throws IOException { }
}

class C extends A {
    //FileNotFoundException 是 IOException 的子类，也是非运行时异常
    @Override
    public void method() throws FileNotFoundException { }
}

class D extends A {
    //ArithmeticException 是 RuntimeException 的子类，是运行时异常
    @Override
    public void method() throws ArithmeticException { }
}

public class Test4 {

    public static void main(String[] args) {
        A a = new D();
        System.out.println(a);
    }

}
