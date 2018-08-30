package edu.just.other;

class Test1 {

    private static void testMethod(){
        System.out.println("testMethod");
    }

    public static void main(String[] args) {
        ((Test1)null).testMethod();
        Test1 test1 = null;
        test1.testMethod();
    }


}
