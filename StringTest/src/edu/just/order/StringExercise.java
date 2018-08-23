package edu.just.order;

import org.junit.Test;

public class StringExercise {

    @Test
    public void stringTest9(){
        String str1 = "str01";
        String str2 = new String("str")+new String("01");
        str2.intern();
        System.out.println(str2 == str1);   //false
    }

    @Test
    public void stringTest8() {
        String str1 = new String("str") + new String("1");
        str1.intern();
        String str2 = "str1";
        System.out.println(str1 == str2);   //true
    }

    @Test
    public void stringTest7(){
        String a = "baseStr";
        final String b = "baseStr";

        String str1 = "baseStr1";
        String str2 = "baseStr" + "1";
        String str3 = a + "1";
        String str4 = b + "1";
        String str5 = new String("baseStr").intern();
        String str6 = str3.intern();

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
        System.out.println(str1 == str5);
        System.out.println(str1 == str6);
    }

    @Test
    public void stringTest6(){
        String a = "hello";
        String b = new String("hello");
        String c = a.intern();
        String d = b.intern();

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
    }

    public String getHello() {
        return "hello";
    }

    @Test
    public void stringTest5(){
        String a = "hello2";
        final String b = getHello();
        String c = b + 2;
        System.out.println(a == c);
    }

    @Test
    public void stringTest4(){
        String a = "helloworld";
        final String b = "hello";
        final String c = "world";
        String d = b + c;
        System.out.println(a == d);
    }

    @Test
    public void stringTest3(){
        String a = "nihaoshijie";

        String b = "nihao";
        String c = "shijie";
        String d = b + c;

        System.out.println(a == d);
    }

    @Test
    public void stringTest2(){
        String a = "hellonihao";
        String b = "hello" + "nihao";
        System.out.println(a == b);
    }

    @Test
    public void stringTest(){
        String a = "hello";
        String b = "hello";

        String a1 = new String("hello");
        String a2 = new String("hello");

        StringBuilder c = new StringBuilder("hello");
        StringBuilder d = new StringBuilder("hello");

        System.out.println(a == b);
        System.out.println(a1 == a2);
        System.out.println(c == d);
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(c));
        System.out.println(a.equals(c));
        System.out.println(c.equals(d));
    }

}
