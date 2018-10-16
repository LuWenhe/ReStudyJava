package edu.just.list;

import edu.just.collection1.Student;
import org.junit.Test;

import java.util.*;

public class ArrayListTest {

    @Test
    public void testClone() {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(1,"TTT","male"));
        arrayList.add(new Student(2,"AAA","female"));
        arrayList.add(new Student(3,"RRR","female"));

        ArrayList<Student> arrayList1 = (ArrayList<Student>) arrayList.clone();
        int i = 0;

        arrayList1.get(0).setName("LWH");
        System.out.println("原来的集合：");
        for(i=0; i<arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("现在的集合：");
        for (i=0; i<arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }
    }

    @Test
    public void testItera() {
        List<String> list = new ArrayList<>();
        list.add("ASD");
        list.add("ADS");
        list.add("DSA");
        list.add("SDA");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.remove();
        }

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String str: list) {
            System.out.println(str);
        }
    }

    @Test
    public void testRetain2() {
        ArrayList<String> listA= new ArrayList<String>();
        listA.add("Tom");
        listA.add("DDD");
        listA.add("AAA");
        ArrayList<String> listB= new ArrayList<String>();
        listB.add("ppp");
        boolean b = listA.retainAll(listB);
        System.out.println(b);
        if(listA.size()>0){
            System.out.println("这两个集合有相同的交集");
        }else{
            System.out.println("这两个集合没有相同的交集");
        }
    }

    @Test
    public void testRetain() {
        ArrayList<String> list = new ArrayList<>();
        list.add("CCC");
        list.add("BBB");
        list.add("DDD");
        list.add("BBB");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("AAA");
        list1.add("BBB");

        boolean b = list.retainAll(list1);
        System.out.println(b);

        System.out.println(list);
        System.out.println(list1);
    }

    @Test
    public void testRemove() {
        ArrayList<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        list.add("EEE");
        list.add("FFF");

//        list.remove(2);
        list.remove("AAA");
        System.out.println(list);
    }

    @Test
    public void testArray() {
        List<String> list = new ArrayList<>(10);
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");

        System.out.println(list);
//        list.add(2,"abc");
//        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("ABC");
        list1.add("QWE");
        list1.add("RTY");

        list.addAll(2, list1);

        System.out.println(list);
    }

    @Test
    public void testArrayList() {
        List<Student> list = new ArrayList<>();
        for (int i=0; i<10; i++) {
            list.add(new Student(1, "BBB", "BBB@qq.com"));
        }
        list.add(new Student(2, "CCC", "CCC@qq.com"));

        for (int i=0; i<4; i++) {
            list.add(new Student(1, "BBB", "BBB@qq.com"));
        }
        list.add(new Student(2, "CCC", "CCC@qq.com"));
        System.out.println(list);
    }

    @Test
    public void copyofTest() {
        String[] arr = new String[5];
        String[] strs = {"AAA", "BBB", "CCC", "DDD"};

        String[] str2 = Arrays.copyOf(strs,3);
        String[] str3 = Arrays.copyOf(strs, 8);

        for (String str: str2) {
            System.out.print(str + " ");
        }

        System.out.println();

        for (String str: str3) {
            System.out.print(str + " ");
        }
    }

    @Test
    public void arrayListTest() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "DDD", "DDD@qq.com"));
        list.add(new Student(1, "BBB", "BBB@qq.com"));
        list.add(new Student(4, "EEE", "EEE@qq.com"));
        list.add(new Student(2, "CCC", "CCC@qq.com"));

        Iterator<Student> iterator = list.iterator();
        iterator.next();
        iterator.remove();
        System.out.println(list);

    }

}
