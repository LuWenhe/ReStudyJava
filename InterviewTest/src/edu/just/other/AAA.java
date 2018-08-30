package edu.just.other;

public interface AAA {

    public void main(String []args);
    boolean setA(Boolean [] test);
    public float get(int x);

}

class VBVB implements AAA{

    @Override
    public void main(String[] args) {

    }

    @Override
    public boolean setA(Boolean[] test) {
        return false;
    }

    @Override
    public float get(int x) {
        return 0;
    }
}