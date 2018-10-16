package edu.just.hash;

import org.junit.Test;

import java.util.*;

public class HashTableTest {

    @Test
    public void test1() {
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        hashtable.put("语文", 1);
        hashtable.put("语文", 1);
        hashtable.put("数学", 2);
        hashtable.put("数学1", 2);
        hashtable.put("数学3", 2);

        for (Map.Entry entry: hashtable.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }

    @Test
    public void testHashTable() {
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        hashtable.put("语文", 1);
        hashtable.put("AAA", 2);
        hashtable.put("英语", 3);
        hashtable.put("历史", 4);
        hashtable.put("政治", 5);
        hashtable.put("地理", 6);
        hashtable.put("生物", 7);
        hashtable.put("化学", 8);
        hashtable.put("高数", 9);
        hashtable.put("计算机", 10);

        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            System.out.print(keys.nextElement() + " ");
        }

        System.out.println();

        Enumeration<Integer> elements = hashtable.elements();
        while (elements.hasMoreElements()) {
            System.out.print(elements.nextElement() + " ");
        }

        for (Map.Entry entry: hashtable.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        System.out.println();

        Iterator iterator = hashtable.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
