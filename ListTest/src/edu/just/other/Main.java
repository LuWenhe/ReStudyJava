package edu.just.other;

import java.util.HashMap;

public class Main {

    static void test(int mapSize) {
        HashMap<Key, Integer> map = new HashMap<>(mapSize);
        for (int i=0; i<mapSize; i++) {
            map.put(Keys.of(i), i);
        }

        long beginTime = System.nanoTime();
        for (int i = 0; i < mapSize; i++) {
            map.get(Keys.of(i));
        }

        long endTime = System.nanoTime();
        System.out.println(endTime - beginTime);
    }

    public static void main(String[] args) {
        for (int i = 10; i < 10000000; i*=10) {
            test(i);
        }
    }

}
