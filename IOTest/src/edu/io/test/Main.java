package edu.io.test;

import org.junit.Test;

import java.io.*;

public class Main {

    @Test
    public void test2() throws Exception {
        File file = new File("file/hello.txt");
        Writer writer = new FileWriter(file);

        String a = "xixixixixixixixixi";
        //以字符流的方式将字符读入文件
        writer.write(a);
        writer.flush();
//        writer.close();

        Reader reader = new FileReader(file);
        char[] chars = new char[1024];
        int i = 0;
        i = reader.read(chars);
        reader.close();

        if (i == -1) {
            System.out.println("文件中无数据");
        }
        else {
            System.out.println(new String(chars,0, i));
        }
    }

    @Test
    public void test() throws UnsupportedEncodingException {
        byte[] bytes = "大家一起来学习呀".getBytes("GB2312");

    }

}
