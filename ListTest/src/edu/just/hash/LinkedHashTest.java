package edu.just.hash;

import org.junit.Test;

import java.util.*;

public class LinkedHashTest {

    @Test
    public void test4() {
        HashMap<String,Integer> hashMap = new LinkedHashMap<>();
        hashMap.put("语文",1);
        hashMap.put("数学",2);
        hashMap.put("英语",3);

        hashMap.get("数学");
    }

    public static void print(LinkedHashMap<String, Integer> linkedHashMap) {
        for (Map.Entry entry: linkedHashMap.entrySet()) {
            System.out.print(entry + " ");
        }

        System.out.println();
    }

    @Test
    public void test3() {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f, true);
        linkedHashMap.put("语文", 1);
        linkedHashMap.put("英语", 2);
        linkedHashMap.put("数学", 3);
        print(linkedHashMap);

        linkedHashMap.get("语文");
        print(linkedHashMap);

        linkedHashMap.put("英语", 4);
        print(linkedHashMap);
    }

    @Test
    public void test2() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("语文", 1);
        map.put("AAA", 2);
        map.put("英语", 3);
        map.put(null, 4);
        map.put("政治", 5);
        map.put("地理", 6);
        map.put("生物", 7);
        map.put("化学", 8);
        map.put("高数", 9);
        map.put("计算机", 10);
        map.put("马原", 11);
        map.put("毛概", 12);
        map.put("毛概", 12);
        // ＞ 12
        map.put("DDD", 13);
        map.put("EEE", 14);
        map.put(null, null);

        System.out.println(map.get("DDD"));

        Set entries = map.entrySet();
        Iterator iterator = entries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test() {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(null, 3);
        linkedHashMap.put("语文", 1);
        linkedHashMap.put("数学", 2);
        linkedHashMap.put("英语",null);
        linkedHashMap.put(null,null);
        linkedHashMap.put("语文",4);

        linkedHashMap.get("语文");

        for (Map.Entry entry: linkedHashMap.entrySet()) {
            System.out.print(entry + " ");
        }
    }

}
