package edu.just.test;

public class OuterClass {

    private String name;
    private int age;

    public class InnerClass {
        public InnerClass() {
            name = "luwenhe";
            age = 12;
        }

        public void display(){
            System.out.println(name + ", " + age);
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();
    }

}
