package edu.just.collection1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {

    @Test
    public void testCollection5() {
        Collection<String> strings = new ArrayList<>();
        strings.add("AA");
        strings.add("BB");
        strings.add("CC");

        Collection<String> strings1 = new ArrayList<>();
        strings1.add("BB");

        boolean b = strings.retainAll(strings1);
        if(strings.size() > 0) {
            System.out.println("这两个集合有相同的交集");
        } else {
            System.out.println("这两个集合没有相同的交集");
        }
    }

    @Test
    public void testCollection4() {
        Collection<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");

        Object[] objects = strings.toArray();

        System.out.println((String) objects[0]);
        System.out.println((String) objects[1]);
        System.out.println((String) objects[2]);
    }

    @Test
    public void testCollection3() {
        Collection<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");

        Collection<String> strings1 = new ArrayList<>();
        strings1.add("G");

        boolean a = strings.contains("A");
        boolean b = strings.containsAll(strings1);
        System.out.println(a + " " + b);

        strings.addAll(strings1);
        System.out.println(strings.size());
    }

    @Test
    public void testCollection2() {
        Collection<Student> students = new ArrayList<>();

        Student stu = new Student(1, "AAA", "男");
        Student stu2 = new Student(2, "BBB", "女");
        Student stu3 = new Student(3, "CCC", "男");

        students.add(stu);
        students.add(stu2);
        students.add(stu3);

        boolean flag = students.isEmpty();
        System.out.println("是否为空：" + flag);

        boolean contains = students.contains(stu);
        System.out.println("是否包括stu：" + contains);

        boolean delete = students.remove(stu);
        System.out.println("是否删除成功：" + delete);

        Iterator iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void testCollection() {
        Collection<Student> students = new ArrayList<>();
        students.add(new Student(1, "AAA", "男"));
        students.add(new Student(2, "BBB", "女"));
        students.add(new Student(3, "CCC", "男"));

        //1.使用 for 循环遍历
        for (Student student: students) {
            System.out.println(student);
        }

        //2. 使用 iterator 进行遍历
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
