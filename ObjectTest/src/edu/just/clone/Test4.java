package edu.just.clone;

import org.junit.Test;

public class Test4 {

    @Test
    public void test3() {
        String[] srcArray = new String[10000000];
        String[] forArray = new String[srcArray.length];
        String[] arrayCopyArray = new String[srcArray.length];

        for (int index = 0; index < srcArray.length; index++) {
            srcArray[index] = String.valueOf(index);
        }

        long start = System.currentTimeMillis();
        for(int index = 0; index < srcArray.length; index++) {
            forArray[index] = srcArray[index];
        }
        long end = System.currentTimeMillis();
        System.out.println("for 方式复制数组：" + (end - start));

        long start1 = System.currentTimeMillis();
        System.arraycopy(srcArray,0, arrayCopyArray,0, srcArray.length);
        long end1 = System.currentTimeMillis();
        System.out.println("arraycopy 复制数组：" + (end1 - start1));
    }

    @Test
    public void test2() {
        String[] st  = {"A","B","C","D","E"};
        String[] dt  = new String[5];
        System.arraycopy(st, 0, dt, 0, 5);
        dt[0] = "F" ;

        for(String str : st){
            System.out.print(" " + str +" ");   // A  B  C  D  E

        }
        System.out.println();
        for(String str : dt){
            System.out.print(" " + str +" ");   // F  B  C  D  E
        }


        System.out.println("数组内对应位置的String地址是否相同:" + (st[0] == dt[0]));
    }

    @Test
    public void test1() {
        String[] st  = {"A","B","C","D","E"};
        String[] dt  = new String[5];
        System.arraycopy(st, 0, dt, 0, 5);

        for(String str : st){
            System.out.print(" " + str +" ");   // A  B  C  D  E

        }
        System.out.println();
        for(String str : dt){
            System.out.print(" " + str +" ");   // A  B  C  D  E
        }

        System.out.println("数组内对应位置的String地址是否相同:" + (st[0] == dt[0]));
    }

}
