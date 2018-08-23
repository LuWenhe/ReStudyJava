package edu.just.other;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OtherTest {

    /*void print() {
        int i;
        System.out.println(i);
    }*/

    @Test
    public void test() {

    }

    @Test
    public void testList() {
        List Listlist1 = new ArrayList();
        Listlist1.add(0);
        List Listlist2 = Listlist1;
        System.out.println(Listlist1.get(0) instanceof Integer);
        System.out.println(Listlist2.get(0) instanceof Integer);
    }

    @Test
    public void mathTest() {
        //向上取整
        System.out.println(Math.ceil(11.3));
        System.out.println(Math.ceil(11.7));
        System.out.println(Math.ceil(-11.5));
        System.out.println(Math.ceil(-11.6));

        System.out.println("=======================");

        //向下取整
        System.out.println(Math.floor(11.5));
        System.out.println(Math.floor(11.6));
        System.out.println(Math.floor(-11.3));
        System.out.println(Math.floor(-11.5));
        System.out.println(Math.floor(-11.6));

        System.out.println("=======================");

        //原来的数字加上0.5后再向下取整
        System.out.println(Math.round(11.3));
        System.out.println(Math.round(11.5));
        System.out.println(Math.round(11.6));
        System.out.println(Math.round(-11.2));
        System.out.println(Math.round(-11.5));
        System.out.println(Math.round(-11.6));
    }

    @Test
    public void booleanTest() {
        Boolean b1 = false;
        Boolean b2 = false;
        Boolean b3 = true;
        Boolean b4 = true;

        System.out.println(b1 == b2);
        System.out.println(b3 == b4);
        System.out.println(b1 == b3);

        System.out.println(b1.equals(b2));
    }

    @Test
    public void testCharacter() {
        Character character = 100;
        Character character1 = 100;
        System.out.println(character == character1);
    }

    @Test
    public void testDouble() {
        Double i1 = 100.0;
        Double i2 = 100.0;
        Double i3 = 200.0;
        Double i4 = 200.0;

        System.out.println(i1==i2);
        System.out.println(i3==i4);
    }

}
