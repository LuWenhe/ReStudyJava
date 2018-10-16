package edu.just.sort;

import com.sun.org.apache.bcel.internal.generic.DDIV;

public class Person implements Comparable<Person> {

    private int age;
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 当前对象的值 < 比较对象的值, 位置排在前
     * 当前对象的值 = 比较对象的值, 位置不变
     * 当前对象的值 > 比较对象的值, 位置排在后
     */
    @Override
    public int compareTo(Person o) {
        // 升序
        return this.age - o.age;

//        return o.age - this.age;
    }

}
