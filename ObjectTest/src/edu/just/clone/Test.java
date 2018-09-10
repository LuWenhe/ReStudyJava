package edu.just.clone;

class Student implements Cloneable {

    private int number;
    private String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student stu1 = new Student(1000,"luwenhe");
        Student stu2 = (Student) stu1.clone();

        System.out.println("学生1: " + stu1.getName().hashCode());
        System.out.println("学生2: " + stu2.getName().hashCode());

        stu2.setName("xixixi");

        System.out.println("学生1: " + stu1.getName().hashCode());
        System.out.println("学生2: " + stu2.getName().hashCode());
    }

}
