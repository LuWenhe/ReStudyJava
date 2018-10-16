package edu.just.generic;

import java.util.ArrayList;
import java.util.List;

public class Main2<T extends Number> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.get(0);

        /*Main2<Integer> main2 = new Main2<>();
        main2.setT(12);

        Main2<Double> main21 = new Main2<>();
        main21.setT(12.32);*/
    }

}
