package edu.just.integer;

public class Test1 {

    public void add(Byte b) {
        b = b++;
    }

    public void test() {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.println(a + "");
        add(b);
        System.out.println(b + "");
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.test();
    }

}
