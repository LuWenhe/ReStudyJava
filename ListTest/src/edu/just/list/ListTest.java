package edu.just.list;

import java.util.AbstractList;

public class ListTest extends AbstractList {

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    public static void main(String[] args) {

        ListTest listTest = new ListTest();
        listTest.remove(0);

    }

}
