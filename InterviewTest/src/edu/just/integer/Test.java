package edu.just.integer;

public class Test {

    private String a = "成员变量";

    public void test() {
        String a = "局部变量";
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.test();
    }
}
