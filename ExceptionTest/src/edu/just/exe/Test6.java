package edu.just.exe;

import java.io.IOException;

class AAA {
    //非检查时异常，运行时异常
    public void method() throws NullPointerException {

    }
}

class BBB extends AAA {
    //检查时异常
    /*@Override
    public void method() throws IOException {

    }*/
}

public class Test6 {
}
