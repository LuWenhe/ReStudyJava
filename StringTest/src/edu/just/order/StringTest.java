package edu.just.order;

import org.junit.Test;

public class StringTest {

    @Test
    public void testString6() {
        String s1 = new String("abc");
        String s2 = s1;
        String s4 = s1;
        String s3 = new String("abc");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);

        s1 = "abc";

        System.out.println(s1 == s2);
        System.out.println(s2 == s4);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
    }

    @Test
    public void testString5() {
        String s1 = "abc";
        String s2 = s1;
        String s3 = "abc";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);

        s1 = "bcd";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
    }

    @Test
    public void stringBuilderTest() {
        StringBuilder stringBuilder = new StringBuilder("hello");
        System.out.println(stringBuilder);

        stringBuilder.append("world");
        System.out.println(stringBuilder);
    }

    @Test
    public void stringTest4(){
        String a = "hello" + "world";
        String a1 = "helloworld";

        String b = "hello";
        String c = "world";
        String d = b + c;

        System.out.println(a);
        System.out.println(d);
        System.out.println(a == d);
        System.out.println(a1 == a);
        System.out.println(a1 == d);
    }

    @Test
    public void stringTest3(){
        String a = "nihaoshije";
        String b = a.substring(0, 4);
        System.out.println(b);
        System.out.println(a);
    }

    @Test
    public void stringTest2(){
        String[] fies = new String[100];
        String result = "";
        for (int i=0; i<fies.length; i++){
            result += fies[i];
        }
    }

    @Test
    public void stringTest(){
        String mango = "mango";
        String s = "abc" + mango + "def" + 47;
        System.out.println(s);
    }
}
