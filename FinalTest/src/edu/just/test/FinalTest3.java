package edu.just.test;

class Final {

    public final void test() {}

    public void test(int i) {}

}

public class FinalTest3 extends Final{

    @Override
    public void test(int i) {
        super.test(i);
        test();
    }
}
