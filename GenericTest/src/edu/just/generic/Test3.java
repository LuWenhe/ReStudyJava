package edu.just.generic;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("aaa");

        List list = stringList;
        list.add(123);
        list.add(123.123);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        String s = stringList.get(0);
        String s1 = stringList.get(1);
    }

}
