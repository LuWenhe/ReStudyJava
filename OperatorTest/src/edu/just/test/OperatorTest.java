package edu.just.test;

import org.junit.Test;

public class OperatorTest {

    private static final String MESSAGE = "taobao";

    @Test
    public void operatorTest9(){
        String a = "tao" + "bao";
        String b = "tao";
        String c = "bao";
        System.out.println(a == MESSAGE);
        System.out.println((b+c) == MESSAGE);
    }

    /**
     * 数值转换
     */
    @Test
    public void operatorTest8(){
        double d = 0.7, below = 0.6;
        float f = 0.4f, fbelow = 0.4f;
        System.out.println("(Int)above: " + (int)d);
        System.out.println("(Int)below: " + (int)below);
        System.out.println("(Int)f: " + (int)f);
        System.out.println("(Int)fbelow: " + (int)fbelow);

        System.out.println("Math.round(above)" + Math.round(d));
        System.out.println("Math.round(below)" + Math.round(below));
        System.out.println("Math.round(f)" + Math.round(f));
        System.out.println("Math.round(fbelow)" + Math.round(fbelow));
    }

    @Test
    public void operatorTest7() {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        System.out.println(s + x + y + z);		//x, y, z 012
        System.out.println(x + " " + s);

        s += "(summend) = ";
        System.out.println(s);
        System.out.println(s + (x + y + z));	//x, y, z (summend) = 3
        System.out.println(s + (x + y) + z);	//x, y, z (summend) = 3

        System.out.println(x + y + s + y + z);
        System.out.println(" " + x);
    }

    @Test
    public void operatorTest6() {
        float f = 1.39e-43f;
        System.out.println(f);

        double d = 47e47d;
        double d1 = 47347;
        System.out.println(d);
        System.out.println(d1);
    }

    static boolean test1(int val) {
        System.out.println("result1: " + (val < 1));
        return val < 1;
    }

    static boolean test2(int val) {
        System.out.println("result2: " + (val < 2));
        return val < 2;
    }

    static boolean test3(int val) {
        System.out.println("result3: " + (val < 3));
        return val < 3;
    }

    @Test
    public void operatorTest5() {
        boolean b = test1(6) && test2(2) && test3(2);
        System.out.println(b);
    }

    /**
     * 使用 equal 比较对象的内容
     */
    @Test
    public void operatorTest4() {
        Integer a1 = new Integer(100);
        Integer a2 = new Integer(100);
        Integer a3 = 100;

        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
    }

    int i;

    @Test
    public void opeartorTest5() {
        OperatorTest o1 = new OperatorTest();
        OperatorTest o2 = new OperatorTest();
        o1.i = o2.i = 100;
        System.out.println(o1.equals(o2));

        o1 = o2;
        System.out.println(o1.equals(o2));
    }

    /**
     * 使用 == 比较对象, == 不能比较基本对象
     */
    @Test
    public void operatorTest3() {
        Integer a1 = new Integer(100);
        Integer a2 = new Integer(100);

        System.out.println(a1 == a2);
        System.out.println(a1 != a2);
    }

    /**
     * 测试自增和自减
     */
    @Test
    public void operatorTest2() {
        int i = 1;
        System.out.println("i: " + i);
        System.out.println("++i: " + ++i);
        System.out.println("i++: " + i++);
        System.out.println("i: " + i);
        System.out.println("--i: " + --i);
        System.out.println("i--: " + i--);
        System.out.println("i: " + i);
    }

    /**
     * 测试一元加、减操作符
     */
    @Test
    public void operatorTest() {
        int a = 2;
        int b = 5;
        int x = a * -b;
        int y = a * (-b);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    char c;

    public static void f(OperatorTest y) {
        y.c = 'z';
    }

    public static void f2(OperatorTest x, OperatorTest y) {
        x.c = 'z';
    }

    @Test
    public void testObject3() {
        OperatorTest o1 = new OperatorTest();
        OperatorTest o2 = new OperatorTest();

        o1.c = 'a';
        o2.c = 'b';

        System.out.println(o1 == o2);

        f2(o1, o2);

        System.out.println(o1 == o2);

    }

    /**
     * 别名问题
     */
    @Test
    public void testObject2() {
        OperatorTest o = new OperatorTest();
        o.c = 'a';
        System.out.println("x.c: " + o.c);

        f(o);
        System.out.println("x.c: " + o.c);
    }

    class People {
        int age;
    }

    @Test
    public void testObject() {
        People p1 = new People();
        People p2 = new People();
        p1.age = 10;
        p2.age = 15;
        System.out.println("p1.age: " + p1.age + " p2.age: " + p2.age);

        p1 = p2;
        System.out.println("p1.age: " + p1.age + " p2.age: " + p2.age);

        p1.age = 30;
        System.out.println("p1.age: " + p1.age + " p2.age: " + p2.age);
    }

    /**
     * 优先级问题
     */
    @Test
    public void testPrioity() {
        int x = 1, y = 2, z = 3;
        int a = x + y - z/2 + z;
        int b = x + (y - 2)/(2 + z);

        System.out.println("a: " + a);		//5
        System.out.println("b: " + b);		//1
    }

}
