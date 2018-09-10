package edu.just.test;

class OuterClass2 {

    private String sex;
    private String aa = "aa";
    private static String name = "name";

    private void print() {
        System.out.println("outerclass");
    }

    private static void printS() {
        System.out.println("outerclass static");
    }

    static class InnerClass {
        public static String name = "luwenhe";

        public void display() {
//            System.out.println(aa);       //静态内部类不能访问外部类的非静态成员变量
            System.out.println(name);       //静态内部类中只能访问外部类的静态成员变量
            printS();
        }

        public static void displayS() {

        }
    }

    class InnerClass2 {

        private void display() {
            System.out.println(name);
            printS();
            OuterClass2.InnerClass.displayS();
        }

    }
}

public class Test3 {
}
