package edu.just.hash;

import org.junit.Test;

import java.rmi.MarshalledObject;
import java.util.*;

public class HashMapTest {

    @Test
    public void test8() {
        HashMap<Integer,String> map = new HashMap<>();
        String aaa = map.put(1, "AAA");
        String bbb = map.put(null, "BBB");
        String put = map.put(null, null);
        String ccc = map.put(null, "CCC");
        String put1 = map.put(2, null);

        System.out.println(aaa + " " + bbb + " " + put + " " + ccc + " " + put1);

        for (Map.Entry entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    @Test
    public void test7() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("语文", 1);
        map.put("AAA", 2);
        map.put("英语", 3);
//        map.put("政治1", 4);
        map.put("政治", 5);
        map.put(null, 4);
        map.put("地理", 6);
        map.put("生物", 7);
        map.put("化学", 8);
        map.put("高数", 9);
        map.put("计算机", 10);
        map.put("马原", 11);
        map.put("毛概", 12);
        // ＞ 12
        map.put("BBB", 13);
        map.put("CCC", 14);

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Test
    public void test6() {
        HashMap<String, Integer> map = new HashMap<>(10);
        map.put("语文", 1);
        map.put("AAA", 2);
        map.put("英语", 3);
        map.put("历史", 4);
        map.put("政治", 5);
        map.put("地理", 6);
        map.put("生物", 7);
        map.put("化学", 8);
        map.put("高数", 9);
        map.put("计算机", 10);
        map.put("马原", 11);
        map.put("毛概", 12);
        map.put("BBB", 13);
        map.put("CCC", 14);

//        map.remove("地理");
        map.remove("计算机");

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Test
    public void test4() {
        HashMap<Integer, String> hashMap = new HashMap<>(10,0.5f);
        hashMap.put(5, "AAA");
        hashMap.put(2, "BBB");
        hashMap.put(null, "POI");
        hashMap.put(7, "RTT");

        System.out.println(hashMap.get(null));
        String remove = hashMap.remove(5);
        System.out.println(remove);
    }

    @Test
    public void test3() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "AAA");
        map.put(2, "AAA");
        map.put(1, "AAA");
        map.put(1, "AAA");
        map.put(3, "AAA");
        map.put(null, "BBB");
        map.put(4, null);
        map.put(null, null);

        for (Map.Entry entry: map.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }

    @Test
    public void tes2() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("语文", 1);
        map.put("AAA", 2);
        map.put("英语", 3);
        map.put("历史", 4);
        map.put("政治", 5);
        map.put("地理", 6);
        map.put(null, 1000);
//        map.put(null, null);
        map.put("生物", 7);
        map.put("化学", 8);
        map.put("高数", 9);
        map.put("计算机", 10);
        map.put("马原", 11);
        map.put("毛概", 12);
        map.put("BBB", 13);
        map.put("CCC", 14);
        map.put("DDD", 15);
        map.put("EEE", 16);

        map.remove("地理");

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Test
    public void test() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "AAA");
        map.put(null, null);

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry entry: set) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    @Test
    public void hashMapTest() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"QWE");
        map.put(1,"QWE");
        map.put(2,"rr");

        Set<Map.Entry<Integer, String>> set = map.entrySet();

        //使用 Iterator 来遍历键值对 Entry<k,v>
        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
        while (iterator.hasNext()) {

            Map.Entry<Integer, String> next = iterator.next();
        }
    }

    @Test
    public void mapTest() {
        Map<Integer, String> map = new HashMap<>();
        map.put(2,"BBB");
        map.put(1,"AAA");
        map.put(3,"CCC");
        map.put(4,"DDD");

        //使用 keySet 获取键的值
        Set<Integer> set = map.keySet();
        for (Integer key: set) {
            System.out.print(key + " ");
        }

        System.out.println();

        //使用 values 获取值，并用 foreach 循环遍历
        Collection<String> values1 = map.values();
        for (String str: values1) {
            System.out.print(str + " ");
        }

        System.out.println();

        //使用 Iterator 遍历值
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
        }

        System.out.println();

        //直接获取键值对 Entry<Integer,String>
        Set<Map.Entry<Integer, String>> set1 = map.entrySet();
        for (Map.Entry entry: set1) {
            System.out.print(entry + " ");
        }

        System.out.println();

        Set<Map.Entry<Integer,String>> set2 = map.entrySet();
        for (Map.Entry entry: set2) {
            System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
        }
    }

}
