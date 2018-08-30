package edu.just.try1;

public class TryTest2 {

    public static void main(String[] args) {
        try {
            System.out.println("try before");       //1
            int i = 10 / 0;
            System.out.println("try after");        //2
        } catch (Error e) {
            System.out.println("catch before");     //3
            e.getMessage();
            System.out.println("catch after");      //4
        } finally {
            System.out.println("finally");          //5
        }
        System.out.println("out");
    }

}
