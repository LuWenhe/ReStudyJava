package edu.just.order;

import org.junit.Test;

public class StringTest {

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
