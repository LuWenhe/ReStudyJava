package edu.just.clone;

class Student implements Cloneable {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    protected Object clone() {
        Student stu = null;

        try {
            stu = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return stu;
    }
}

public class Test {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setNumber(1000);
        Student stu2 = (Student) stu1.clone();

        System.out.println("学生1: " + stu1.getNumber());
        System.out.println("学生2: " + stu2.getNumber());

        stu2.setNumber(2000);

        System.out.println("学生1: " + stu1.getNumber());
        System.out.println("学生2: " + stu2.getNumber());

        //false, 此时 stu1 和 stu2 不是同一个对象
        System.out.println(stu1 == stu2);
    }

}
