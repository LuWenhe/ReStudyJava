package edu.just.a;

class BB {
    void method() {
        System.out.println("BB method...");
    }

    static void test(){
        System.out.println("BB test...");
    }
}

class CC extends BB {
    @Override
    void method() {
        System.out.println("CC method...");
    }

    static void test() {
        System.out.println("CC test");
    }
}

public class AA {

    public static void main(String[] args) {
        BB bb = new BB();
        bb.method();
        bb.test();

        BB bc = new CC();
        bc.method();
        bc.test();
    }

}
