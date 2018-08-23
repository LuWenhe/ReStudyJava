package edu.just.overload;

public class OverLoadTest3 {

    void f1(char x) {
        System.out.println("f1(char)");
    }
    void f1(byte x) {
        System.out.println("f1(byte)");
    }
    void f1(short x) {
        System.out.println("f1(short)");
    }
    void f1(int x) {
        System.out.println("f1(int)");
    }
    void f1(long x) {
        System.out.println("f1(long)");
    }
    void f1(float x) {
        System.out.println("f1(float)");
    }
    void f1(double x) {
        System.out.println("f1(double)");
    }

    void f2(byte x) {
        System.out.println("f2(byte)");
    }
    void f2(short x) {
        System.out.println("f2(short)");
    }
    void f2(int x) {
        System.out.println("f2(int)");
    }
    void f2(long x) {
        System.out.println("f2(long)");
    }
    void f2(float x) {
        System.out.println("f2(float)");
    }
    void f2(double x) {
        System.out.println("f2(double)");
    }

    void f3(short x) {
        System.out.println("f3(short)");
    }
    void f3(int x) {
        System.out.println("f3(int)");
    }
    void f3(long x) {
        System.out.println("f3(long)");
    }
    void f3(float x) {
        System.out.println("f3(float)");
    }
    void f3(double x) {
        System.out.println("f3(double)");
    }

    void f4(int x) {
        System.out.println("f4(int)");
    }
    void f4(long x) {
        System.out.println("f4(long)");
    }
    void f4(float x) {
        System.out.println("f4(float)");
    }
    void f4(double x) {
        System.out.println("f4(double)");
    }

    void f5(long x) {
        System.out.println("f5(long)");
    }
    void f5(float x) {
        System.out.println("f5(float)");
    }
    void f5(double x) {
        System.out.println("f5(double)");
    }

    void testChar(){
        char x = 'x';
        System.out.println("char...");
        f1(x);f2(x);f3(x);f4(x);f5(x);
        System.out.println();
    }

    void testByte(){
        byte x = 0;
        System.out.println("byte...");
        f1(x);f2(x);f3(x);f4(x);f5(x);
        System.out.println();
    }

    void testShort(){
        short x = 0;
        System.out.println("short...");
        f1(x);f2(x);f3(x);f4(x);f5(x);
        System.out.println();
    }

    void testInt(){
        int x = 0;
        System.out.println("int...");
        f1(x);f2(x);f3(x);f4(x);f5(x);
        System.out.println();
    }

    void testLong(){
        long x = 0;
        System.out.println("long...");
        f1(x);f2(x);f3(x);f4(x);f5(x);
        System.out.println();
    }

    void testFloat(){
        float x = 0;
        System.out.println("float...");
        f1(x);f2(x);f3(x);f4(x);f5(x);
        System.out.println();
    }

    void testDouble(){
        double x = 0;
        System.out.println("double...");
        f1(x);f2(x);f3(x);f4(x);f5(x);
        System.out.println();
    }

    public static void main(String[] args) {
        OverLoadTest3 loadTest3 = new OverLoadTest3();
        loadTest3.testChar();
        loadTest3.testByte();
        loadTest3.testShort();
        loadTest3.testInt();
        loadTest3.testLong();
        loadTest3.testFloat();
        loadTest3.testDouble();
    }

}
