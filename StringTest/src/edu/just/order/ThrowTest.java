package edu.just.order;

import java.util.ArrayList;
import java.util.List;

public class ThrowTest {

    public static void test(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i] % 2 == 0) {
                    throw new NullPointerException();
                } else {
                    System.out.print(i);
                }
            } finally {
                System.out.print("e");
            }
        }
    }

    public static List<Object> testWrap(){
        List<Object> list = new ArrayList<>();

        try {
            list.add("try");
            System.out.println("try block");
            return list;
        } catch(Exception e) {
            list.add("catch");
            System.out.println("catch block");
            return list;
        } finally {
            list.add("finally");
            System.out.println("finally block ");
        }
    }

    public static int testBasic(){
        int i = 1;

        try{
            i++;
//            int aa = 10 / 0;
            System.out.println("try block, i = "+i);
            return i;
        }catch(Exception e){
            i ++;
            System.out.println("catch block i = "+i);
            return i;
        }finally{
            i = 10;
            System.out.println("finally block i = "+i);
//            return i;
        }
    }

    public static int get1(){
        int i = 1;

        try{
            i++;
            System.out.println("try block, i = "+i);
        }catch(Exception e){
            i ++;
            System.out.println("catch block i = "+i);
        }finally{
            i = 10;
            System.out.println("finally block i = "+i);
        }

        return i;
    }

    public static boolean get(){
        try {
            return true;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return false;
        }
    }

    public static void main(String[] args) {
        try {
            test(new int[] {1, 2, 3, 4, 5});
        } catch (Exception e) {
            System.out.print("E");
        }
    }

}