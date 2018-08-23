package edu.just.integer;

import org.junit.Test;

public class IntegerTest {

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
