package edu.just.try1;

public class TryTest {

    public static int test() {
        int i = 10;
        try {
            System.out.println("try 中的结果：" + i);
            int j = 10 / 0;
            return i++;
        } catch (Exception e) {
            System.out.println("catch 中的结果：" + i);
            return i;
        }finally {
            System.out.println("finally 中的结果：" + i);
//            return ++i; // i:12 蓝色区域
        }
    }

    public static void main(String[] args) {
        System.out.println("最终结果：" + TryTest.test());
    }

}
