package edu.just.generic;

import java.util.ArrayList;
import java.util.List;

class T<E> {
    public static <E> E ifthen(boolean b, E first, E second) {
        return first;
    }

    public E get() {
        return null;
    }
}

public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        print(list);
        print(list1);

        System.out.println(ifThenElse(false,"111","222"));
    }

    private static void print(List<?> list) {
        for (Object o: list) {
            System.out.println(o);
        }
    }

    public static <T> T ifThenElse(boolean b, T first, T second) {
        return b ? first : second;
    }

}
