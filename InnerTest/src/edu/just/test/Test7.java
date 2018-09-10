package edu.just.test;

interface InnerClass1 {
    int getNum();
}

public class Test7 {

    class InnerClassImpl implements InnerClass1 {
        int number;

        public InnerClassImpl(int num) {
            number = num + 2;
        }

        @Override
        public int getNum() {
            return number;
        }
    }

    public InnerClass1 getInnerClass(final int num) {
        return new InnerClassImpl(num);
    }

    public static void main(String[] args) {
        Test7 test7 = new Test7();
        InnerClass1 innerClass = test7.getInnerClass(10);
        System.out.println(innerClass.getNum());
    }

}
