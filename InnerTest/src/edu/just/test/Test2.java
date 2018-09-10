package edu.just.test;

class OuterClass {
    private int i = 1;
    public static String str = "str";

    public void print() {
        System.out.println("outerclass");
    }

    static class StaClass {
        private String s = "s";
        static int j = 2;

        static int getInt() {
            return j;
        }

        private String getString() {
            return str + s;             //此处访问到外部类的静态变量
        }

        static class InStaClass {
            int x = 4;
            static int y = 5;
            static int getInt() {
//                return x;
                return y;
            }
        }
    }

    class InnerClass {
//        static int a = 1;
    }

    public StaClass getInner() {
        return new StaClass();
    }
}

public class Test2 {
    public static void main(String[] args) {
        int anInt = OuterClass.StaClass.getInt();
        System.out.println(anInt);

//        OuterClass.StaClass.getString();

        int anInt1 = OuterClass.StaClass.InStaClass.getInt();
        System.out.println(anInt1);

        new OuterClass().getInner();
    }
}
