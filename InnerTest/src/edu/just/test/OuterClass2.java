package edu.just.test;

/**
 * 成员内部类
 */
public class OuterClass2 {

    private String str;

    public void outerDisplay() {
        System.out.println("outerclass ...");
    }

    public class InnerClass {
        public void innerDisplay() {
            str = "luwenhe ...";
            System.out.println(str);
            outerDisplay();
        }
    }

    public InnerClass getInnerClass() {
        return new InnerClass();
    }

    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass innerClass = outerClass2.getInnerClass();
        innerClass.innerDisplay();
    }

}
