package edu.just.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorTest {

    @Test
    public void test() {
        int a = 10;
        Integer b = new Integer(10);
        System.out.println(a == b);
    }

    @Test
    public void testVector3() {
        List<String> vector = new Vector<>();
        vector.add("AAA");
        vector.add("BBB");
        vector.add("CCC");
        vector.add("DDD");

        List<String> list = new ArrayList<>();
        list.add("AAA");
        vector.removeAll(list);

        System.out.println(vector);
    }

    @Test
    public void testVector2() {
        List<String> list = new Vector<>(0, -6);
        for(int i=0; i<5; i++) {
            list.add("AAA");
        }

        list.add("AAA");
    }

    @Test
    public void testVector() {
        List<String> list = new Vector<>();
        for(int i=0; i<10; i++) {
            list.add("AAA");
        }

        list.add("AAA");

        for (int i=0; i<9; i++) {
            list.add("BBB");
        }

        list.add("CCC");
    }

}
