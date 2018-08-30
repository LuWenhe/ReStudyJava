package edu.just.exe;

public class Test2 {

    static void calculate() throws ArithmeticException{
        int i = 10 / 0;
    }

    public static void main(String[] args) {
        /*try {
            calculate();
        } catch (ArithmeticException e) {
            System.out.println("hello");
            e.printStackTrace();
        }*/
        System.out.println("hello");
        calculate();
    }
}
