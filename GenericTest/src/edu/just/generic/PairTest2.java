package edu.just.generic;

import java.util.ArrayList;
import java.util.List;

public class PairTest2 {

    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        System.out.println(min + " " + max);
        return new Pair<>(min,max);
    }

    public static void main(String[] args) {
        String[] a = {"AAA", "BBB", "CCC", "DDD", "EEE"};
        Pair<String> minmax = minmax(a);
        System.out.println(minmax.getFirst());
        System.out.println(minmax.getSecond());

        List<? extends String> list = new ArrayList<>();
        String s = list.get(0);
    }

}
