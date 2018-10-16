package edu.just.test;

class Outer {

    private String a = "a";

    public int i = 1;

    class Inner {
        private String b = "b";
        public String c = "c";
//        public int i = 22;

        public int getInt() {
            return i;           //内部类可以访问外部类变量
        }

        private String getString() {
            return a + b + c;   //内部类可以访问外部类的 private 变量
        }
    }

    public String getParam() {
        Inner inner = new Inner();
        //外部类可以访问内部类的任何变量，包括私有变量
        inner.b = "bb";
        inner.c = "cc";

        return inner.getString() + inner.getInt();
    }
}

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.getParam());

        Outer.Inner inner = outer.new Inner();
        inner.c = "ccc";

//        inner.b = "bbb";
        System.out.println(inner.getInt());
//        System.out.println(inner.getString());
    }
}
