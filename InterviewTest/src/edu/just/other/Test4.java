package edu.just.other;

class Father {
    static int hello = 1;

    public static void show() {
        System.out.println("父类的 show");
    }

    public void method() {
        System.out.println("父亲的 method");
    }
}

class Son extends Father {
    static int hello = 2;

    public static void show() {
        System.out.println("子类的 show");
    }

    @Override
    public void method() {
        System.out.println("子类的 method");
    }
}

public class Test4 {
    public static void main(String[] args) {
        /**
         * 父类的 show
         * 子类的 method
         * 1
         * 2
         */
        Father father = new Son();
        Son son = new Son();
        father.show();
        father.method();
        System.out.println(Father.hello);
        System.out.println(Son.hello);
    }
}
