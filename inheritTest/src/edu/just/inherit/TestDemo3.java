package edu.just.inherit;

class AA {
    String name="A";

    public static void method() {
        System.out.println("hello AA");
    }
}

class BB extends AA {
    String name="B";

    public static void method() {
        System.out.println("hello BB");
    }
}

class CC extends BB {
    String name="C";

    public static void method() {
        System.out.println("hello CC");
    }
}

public class TestDemo3 {

    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println(aa.name);
        aa.method();

        AA ab = new BB();
        System.out.println(ab.name);
        ab.method();

        AA ac = new CC();
        System.out.println(ac.name);
        ac.method();

        BB bb = new BB();
        System.out.println(bb.name);
        bb.method();

        BB bc = new CC();
        System.out.println(bc.name);
        bc.method();

        CC cc = new CC();
        System.out.println(cc.name);
        cc.method();
    }

}
