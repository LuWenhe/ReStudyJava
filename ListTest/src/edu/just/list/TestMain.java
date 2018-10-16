package edu.just.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestMain {
    private static int SIZE = 11111111;

    private static void forSpeed(List<Integer> list) {
        long startTime = System.currentTimeMillis();

        for(int i=0; i<list.size(); i++) {
            list.get(i);
        }

        long endTime = System.currentTimeMillis();

        System.out.println(list.getClass().getSimpleName() + " 使用for循环的时间为：" + (endTime - startTime));
    }

    private static void foreachSpeed(List<Integer> list) {
        long startTime = System.currentTimeMillis();

        for (Integer i: list) {

        }

        long endTime = System.currentTimeMillis();

        System.out.println(list.getClass().getSimpleName() + " 使用foreach循环的时间为：" + (endTime - startTime));
    }

    private static void iteratorSpeed(List<Integer> list) {
        long startTime = System.currentTimeMillis();

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        long endTime = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName() + " 使用iterator循环的时间为：" + (endTime - startTime));
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for(int i=0; i<SIZE; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        forSpeed(arrayList);
        foreachSpeed(arrayList);
        iteratorSpeed(arrayList);

        System.out.println();

//        forSpeed(linkedList);
        foreachSpeed(linkedList);
        iteratorSpeed(linkedList);
    }
}
