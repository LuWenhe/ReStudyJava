package edu.just.test;

class Bean {
    class Bean3 {
        public int k = 0;
    }
}

public class Test {

    class Bean1 {
        public int i = 0;
    }

    static class Bean2 {
        public int j = 0;
    }

    public static void main(String[] args) {
        Test test = new Test();
        Test.Bean1 bean1= test.new Bean1();

        Test.Bean2 bean2 = new Test.Bean2();

        Bean bean = new Bean();
        Bean.Bean3 bean3 = bean.new Bean3();
    }

}
