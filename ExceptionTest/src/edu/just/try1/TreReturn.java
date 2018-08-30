package edu.just.try1;

public class TreReturn {

    public static int test() {
        try {
            int i = 10 * 1;
            System.out.println("try before");
            return i;
        } finally {
            System.out.println("finally before");
            return 100;
        }
    }

    public static void main(String[] args) {
        System.out.println(TreReturn.test());
        Integer.parseInt("12");
    }

}
