package edu.just.exe;

import java.io.IOException;

public class ExceptionTest{

    void printA() throws Exception {
        int a = 5;
        if (a < 10) {
            throw new IOException("HI");
        }
    }

    void printExe() throws FileFormatException {
        int b = 10;
        if (b < 20) {
            throw new FileFormatException();
        }
    }

    void printB() throws Exception {
        printA();
    }

    public static void main(String[] args) throws Exception {
        /*ExceptionTest exceptionTest = new ExceptionTest();
        exceptionTest.printA();*/
    }

}
