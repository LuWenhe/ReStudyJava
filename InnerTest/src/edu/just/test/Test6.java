package edu.just.test;

interface InnerClass {
    int getNum();
}

public class Test6 {

    public InnerClass getInnerClass(final int num, String str2) {
        return new InnerClass() {
            int num1 = num + 3;

//          public InnerClass {}    //你们内部类不能定义构造函数

//          static int a = 1;     //匿名内部类不能存在任何静态成员变量

//          public static void print() {}   //匿名内部类不能存在静态方法

            @Override
            public int getNum() {
                return num1;
            }

        };
    }

    public static void main(String[] args) {
        Test6 test6 = new Test6();
        InnerClass luwehe = test6.getInnerClass(12, "luwehe");
        System.out.println(luwehe.getNum());
    }
}
