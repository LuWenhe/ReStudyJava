package edu.just.list;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    @Test
    public void test2() {
        List<String> list = new LinkedList<>();
        list.add("AAA");
        list.add("AAA");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test1() {
        LinkedList<String> list = new LinkedList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("CCC");
        list.add("AAA");

        list.offer("EEE");

        Iterator<String> iterator = list.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test() {
        List<String> list = new LinkedList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");

        List<String> list1 = new LinkedList<>();
        list1.add("111");
        list1.add("222");

        list.addAll(4, list1);
        System.out.println(list);
    }

    @Test
    public void testLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("AAA");
        linkedList.add("BBB");

        linkedList.add(2,"CCC");
        System.out.println(linkedList);
    }

}
