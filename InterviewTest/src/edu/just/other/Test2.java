package edu.just.other;

public class Test2 {

    static int i = 0;

    public static int method() {
        i++;
        return i;
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.method();
        int j = test2.method();
        System.out.println(j);
    }

}
