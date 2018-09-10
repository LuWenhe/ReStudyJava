package edu.just.integer;

import org.junit.Test;

public class IntegerTest {

    @Test
    public void test10() {
        System.out.println(0.1 + 0.2);
        System.out.println(3 * 0.1);
        System.out.println(4 * 0.1);
        System.out.println(3 * 0.1 == 0.3);
        System.out.println(13 * 0.1 == 1.3);
        System.out.println(9 * 0.1 == 0.9);
        System.out.println(3 * 0.1 / 3);
    }

    @Test
    public void test9() {
        double d = Math.cos(45);
        double v = Math.toRadians(45);
        System.out.println(d + " " + v);
    }

    @Test
    public void test8() {
        int a = Integer.parseInt("200");
        int b = Integer.valueOf(200).intValue();
        System.out.println(a == b);
    }

    @Test
    public void test7() {
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);
        String i3 = "100";
        String i4 = "1" + new String("00");
        String i5 = "1" + "00";
        System.out.println(i3 == i4);
        System.out.println(i3 == i5);
    }

    @Test
    public void test6() throws Exception{
        try {
            throw new Exception();
        } catch (Exception e){
            System.out.println("e");
        }
    }

    @Test
    public void test5(){
        Integer i01 = 180;
        int i02 = 180;
        Integer i03 =Integer.valueOf(180);
        Integer i04 = new Integer(180);

        System.out.println(i01 == i02);
        System.out.println(i01 == i03);
        System.out.println(i03 == i04);
        System.out.println(i02 == i03);
    }

    @Test
    public void test4(){
        Integer i01 = 59;
        int i02 = 59;
        Integer i03 =Integer.valueOf(59);
        Integer i04 = new Integer(59);

        System.out.println(i01 == i02);
        System.out.println(i01 == i03);
        System.out.println(i03 == i04);
        System.out.println(i02 == i03);
    }

    @Test
    public void test3() {
        byte b;
        b = 3;
        b = (byte)(b * 3);
    }

    @Test
    public void test2(){
        byte a = 1;
        byte b = 2;
        a = (byte) (a + b);
        a += b;
        System.out.println(a);
    }

    @Test
    public void test(){
        byte b1 = 1;
        byte b2 = 2;
        byte b3, b6;

        final byte b4 = 4, b5 =6;
        b6 = b4 + b5;
//        b3 = (b1 + b2);
        System.out.println(b6);
    }

    @Test
    public void testInteger2() {
        Integer a = 10;
        Integer b = 20;
        Long g = 30L;
        Long h = 20L;

        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));
        System.out.println(g.equals(a + h));
    }

    @Test
    public void testInteger1() {
        Integer a = 10;
        Integer b = 20;
        Integer c = 30;
        Integer d = 30;
        Integer e = 300;
        Integer f = 300;

        Integer g = a + b;

        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == g);
        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
    }

    @Test
    public void testInteger() {
        Integer a = 100;
        Integer b = 100;

        Integer a1 = 200;
        Integer b1 = 200;

        Integer a2 = new Integer(100);

        System.out.println(a == b);
        System.out.println(a1 == b1);
        System.out.println(a == a2);
    }

}
