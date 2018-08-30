package edu.just.test;

public class OuterClass3 {

    private String sex;
    private String aa = "lww";
    private static String name = "luwenhe";

    /**
     * 静态内部类
     */
    static class InnerClass1 {

        public static String name1 = "luwenhe1";

        public void display() {
            /**
             * 静态内部类只能访问外围类的静态成员变量和方法
             * 不能访问外围类的非静态成员变量和方法
             */
            System.out.println(name);
        }

        public static void dis() {
            System.out.println("dis");
        }
    }

    /**
     * 非静态内部类
     */
    class InnerClass2 {
        //非静态内部类不能存在静态成员变量
        public String name2 = "luwenhe2";

        //非静态内部类中可以调用外围类的任何成员，不管是静态还是非静态
        public void display() {
            System.out.println(name);
        }
    }


    public static void main(String[] args) {
        OuterClass3 outerClass3 = new OuterClass3();

        //调用静态内部类
        OuterClass3.InnerClass1 innerClass1 = new OuterClass3.InnerClass1();
        //调用静态内部类的非静态方法
        innerClass1.display();

        //调用静态内部类的静态方法
        OuterClass3.InnerClass1.dis();

        //调用非静态内部类
        OuterClass3.InnerClass2 innerClass2 = outerClass3.new InnerClass2();
        innerClass2.display();

        OuterClass3.InnerClass2 innerClass21 = new OuterClass3().new InnerClass2();
    }
}
