package edu.just.generic;

import java.util.ArrayList;
import java.util.List;

class AA<T> {

    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public <T> T get(T...t) {
        return t[0];
    }

    public <E> E get1(E...e) {
        return e[0];
    }

    public static void main(String[] args) {
        AA<Integer> aa = new AA<>();

        Integer t = aa.getT();
        aa.setT(12);

        String asd = aa.get("asd");
        Integer integer = aa.get(123);

        String asd1 = aa.get1("asd");
        Integer aa1 = aa.get1(123);

    }
}

class BB {

    public <T> T get(T...t) {
        return t[0];
    }

    public T get3(T...t) {
        return t[0];
    }

    public <E> E get1(E...e) {
        return e[0];
    }

    public static void main(String[] args) {
        BB bb = new BB();
        String asd = bb.get("asd");
        Integer integer = bb.get(123);

        String asd1 = bb.get1("asd");
        Integer bb1 = bb.get1(123);
    }
}

public class ArrayAlg {

    public static <T> T getMiddle(T ... a) {

        return null;
    }

    public static <T extends Comparable> T min(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }

        T small = a[0];
        for (int i = 0; i < a.length; i++) {
            if (small.compareTo(a[i]) > 0) {

            }
        }
        return small;
    }

    public <E> E get(E...e) {
        return e[0];
    }

    public static void main(String[] args) {
    }

}
