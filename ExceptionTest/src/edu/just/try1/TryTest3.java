package edu.just.try1;

import java.util.ArrayList;
import java.util.List;

public class TryTest3 {

    public static void testTry(){
        List<Integer> list = new ArrayList<>();
        long a = System.currentTimeMillis();

        try {
            for(int i = 0; i<10000000; i++)
                list.add(i);
        } catch (Exception e) {}

        long b = System.currentTimeMillis();
        System.out.println(b + ", " + a);
        System.out.println("try 用的时间为: " + (b - a));
    }

    public static void testNor(){
        List<Integer> list = new ArrayList<>();
        long a = System.currentTimeMillis();

        for(int i = 0; i<10000000; i++)
            list.add(i);

        long b = System.currentTimeMillis();
        System.out.println(b + ", " + a);
        System.out.println("nor 用的时间为: " + (b - a));
    }

    public static void testTry5(){
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<10; i++) {
            try {
                System.out.println("1: " + i);
                int yi = 10 / 0;
                list.add(i);
            } catch(Exception e) {
                System.out.println("catch");
            }
            System.out.println("2: " + i);
        }

        System.out.println("last");
    }

    public static void tesrTry6() {
        List<Integer> list = new ArrayList<>();

        try {
            for (int i=0; i<10; i++){
                int j = 19 / 0;
                list.add(i);
                System.out.println("1: " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("catch");
        }

        System.out.println("last");
    }

    public static void main(String[] args) {
        /*TryTest3.testTry();
        TryTest3.testNor();*/
   //    TryTest3.testTry5();
        TryTest3.tesrTry6();
    }

}
