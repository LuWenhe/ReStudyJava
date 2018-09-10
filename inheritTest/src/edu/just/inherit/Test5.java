package edu.just.inherit;

class Father {
    public Father() {
        System.out.println("father");
    }
}

class Son extends Father {
    public Son(String a) {
        System.out.println("son");
    }
}

public class Test5 {

    public static void main(String[] args) {
        Son son = new Son("aa");
    }

}
