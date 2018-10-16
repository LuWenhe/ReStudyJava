package edu.just.generic;

public class Test2 extends Pair<String> {

    @Override
    public void setFirst(String first) {
        super.setFirst(first);
    }

    @Override
    public String getFirst() {
        return super.getFirst();
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.setFirst("aaa");
        test2.getFirst();
    }
}
