package edu.just.overload;

public class OverLoadTest2 {

    static void fun(int s) {
        System.out.println("fun int");
    }

    static void fun(String s) {
        System.out.println("fun string");
    }

    static void fun(int s, int b){
        System.out.println("fun int int");
    }

    static void fun(String s, int i) {
        System.out.println("fun s i");
    }

    static void fun(int i, String s) {
        System.out.println("fun s i");
    }

    public static void main(String[] args) {
        OverLoadTest2.fun(1);
        OverLoadTest2.fun("nihao");
        OverLoadTest2.fun(1, 2);
        OverLoadTest2.fun("nihao", 22);
        OverLoadTest2.fun(22, "nihao");
    }

}
