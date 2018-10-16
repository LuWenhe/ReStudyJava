package edu.io.test;

import org.junit.Test;

import java.io.*;

public class IOTest {

    @Test
    public void test2() {
        File file = new File("file/nihao2.txt");
        Writer writer = null;

        try {
            writer = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String str = "luwenhe nihaos hijie";

        try {
            //将字符内容写入文件
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Reader reader = null;

        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        char[] chars = new char[20];
        int r=0;
        try {
            r = reader.read(chars);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(new String(chars,0,r));
    }

    @Test
    public void test() {
        File file = new File("file/nihao.txt");
        OutputStream out = null;

        try {
            //字节文件输出流
            out = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //将字符串转为字节数组
        byte[] b = "hello world".getBytes();
        try {
            //将 byte 数组写到文件中
            out.write(b);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 读取文件
        InputStream in = null;
        try {
            in = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        byte[] b1 = new byte[1024];
        int len=0;
        try {
            len = in.read(b1);
            System.out.println(len);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(new String(b1,0,len));
    }

}
