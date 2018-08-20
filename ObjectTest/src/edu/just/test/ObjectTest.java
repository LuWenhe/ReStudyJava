package edu.just.test;

import org.junit.Test;

public class ObjectTest {

    void foo(StringBuffer stringBuffer) {
        stringBuffer.append("world");
    }

    void foo1(StringBuffer stringBuffer) {
        stringBuffer = new StringBuffer("ipad");
    }

    @Test
    public void bufferTest2() {
        StringBuffer sb = new StringBuffer("hello");
        foo(sb);
        System.out.println(sb);

        foo1(sb);
        System.out.println(sb);
    }

    public static void operator(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }

    @Test
    public void bufferTest() {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator(a, b);
        System.out.println(a + "," + b);
    }

    @Test
    public void test2() {
        int a = 500;
        int b = 500;

        Integer a1 = 1000;
        Integer a2 = 1000;

        Integer a3 = 5;
        Integer a4 = 5;

        System.out.println(a == b);
        System.out.println(a1 == a2);
        System.out.println(a3 == a4);
    }

    void foo(int val) {
        val = 100;
    }

    void foo1(String text) {
        text = "win";
    }

    @Test
    public void print() {
        int val = 200;
        foo(val);
        System.out.println(val);

        String text = "hello";
        foo1(text);
        System.out.println(text);
    }

    static int i = 10;

    static int increment() {
        i++;
        return i;
    }

    @Test
    public void testStatic2() {
        System.out.println(ObjectTest.increment());
    }

    @Test
    public void testStatic() {
        i++;
        ObjectTest objectTest01 = new ObjectTest();
        ObjectTest objectTest02 = new ObjectTest();
        System.out.println(objectTest01.i);
        System.out.println(objectTest02.i);

        System.out.println(ObjectTest.i);
        i++;
        System.out.println(ObjectTest.i);
    }

    @Test
    public void testString2() {
        String s1 = new String("aaa");
        String s2 = s1;
        String s3 = new String("aaa");
        String s4 = "aaa";

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s2 == s3: " + (s2 == s3));
        System.out.println("s1 == s4: " + (s1 == s4));

        s1 = "aaa";

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s2 == s3: " + (s2 == s3));
        System.out.println("s1 == s4: " + (s1 == s4));
    }

    @Test
    public void testString() {
        String s1 = "abc";
        String s2 = s1;
        String s3 = "abc";

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s2 == s3: " + (s2 == s3));

        s1 = "bcd";

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s2 == s3: " + (s2 == s3));
    }

    @Test
    public void test() {
        Integer i = 100;
        Integer j = 200;

        System.out.println(i == j);
    }

}
