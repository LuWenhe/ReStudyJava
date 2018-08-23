package edu.just.this1;

public class ThisTest {

    int i;

    ThisTest ii() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        ThisTest thisTest = new ThisTest();

    }

}
