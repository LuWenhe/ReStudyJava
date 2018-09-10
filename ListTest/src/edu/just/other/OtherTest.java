package edu.just.other;

import org.junit.Test;

import java.util.Arrays;

public class OtherTest {

    @Test
    public void arrayOfTest() {
        Student[] students = new Student[] {
                new Student("CCC","male","AAA@126.com"),
                new Student("BBB","female","BBB@126.com"),
                new Student("AAA","female","CCC@126.com"),
        };

        Student[] target = new Student[students.length];

        System.arraycopy(students,0, target,0,students.length);

        target[0].setName("LWH");

        System.out.println("修改目标对象属性值后的原对象：");
        for (Student stu: students) {
            System.out.println(stu);
        }

        System.out.println("修改目标对象属性值后得对象：");
        for(Student stu: target) {
            System.out.println(stu);
        }
    }

    @Test
    public void copyofTest() {
        Student[] students = new Student[] {
                new Student("CCC","male","AAA@126.com"),
                new Student("BBB","female","BBB@126.com"),
                new Student("AAA","female","CCC@126.com"),
        };

        Student[] students1 = Arrays.copyOf(students, 3);

        students1[0].setName("LWH");

        System.out.println("修改目标对象属性值后的原对象：");
        for (Student stu: students1) {
            System.out.println(stu);
        }

        System.out.println("修改目标对象属性值后得对象：");
        for(Student stu: students) {
            System.out.println(stu);
        }
    }

}
