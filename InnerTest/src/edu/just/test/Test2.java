package edu.just.test;

class Outer {

    private int a = 1;

    class Inner {
        private int a = 2;
        public void print() {
            int a = 3;
            System.out.println("局部变量: " + a);
            System.out.println("内部类变量: " + this.a);
            System.out.println("外部类变量: " + Outer.this.a);
        }
    }

    private class Inner2 {
        public void print2(){
            System.out.println("Inner2");
        }
    }
}

public class Test2 {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.new Inner().print();
    }

}
