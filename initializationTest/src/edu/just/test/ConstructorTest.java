package edu.just.test;

public class ConstructorTest {

    class Super {
        int flag = 1;

        Super() {
            test();
        }

        void test() {
            System.out.println("Super.test() flag=" + flag);
        }
    }

    class Sub extends Super {
        Sub(int i) {
            flag = i;
            System.out.println("Sub.Sub()flag=" + flag);
        }

        @Override
        void test() {
            System.out.println("Sub.test()flag="+flag);
        }
    }

    public static void main(String[] args) {
        new ConstructorTest().new Sub(10);
    }

}
