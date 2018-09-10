package edu.just.test;

public class Test5 {
    private String test(boolean b) {
        if (b) {
            class A {
                private String a = "a";

                public String getA() {
                    return a;
                }
            }

            A a = new A();
            String a1 = a.getA();
            return a1;
        }
        return null;
    }

    public static void main(String[] args) {
        Test5 test5 = new Test5();
        String test = test5.test(true);
        System.out.println(test);
    }
}
