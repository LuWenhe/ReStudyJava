package edu.io.test;

import org.junit.Test;

import java.io.*;

public class IOOutputAndWriter {

    @Test
    public void testWriter2() throws IOException {
        Writer writer = new FileWriter("file/abcd2.txt");

        String a = "hello world!!!xi xi xi";

        writer.write(a.toCharArray());

        writer.close();
    }

    /**
     * Writer：输出字节流
     * FileWriter：创建了一个可以向文件中写入字符的 Writer 类
     */
    @Test
    public void testWriter() throws IOException {
        Writer writer = new FileWriter("file/abcd.txt");

        String str = "hello world!!111!";

        writer.write(str);

//        writer.close();

        writer.flush();
    }

    @Test
    public void testOutputStream2() throws IOException {
        OutputStream out = new FileOutputStream("file/abcd.txt");

        String a = "hello world>>>";

        out.write(a.getBytes(),2,10);

        out.close();
    }

    /**
     * OutputStream：输出字节流
     * FileOutputStream：文件输出流，创建了一个可以向文件写入字节的 OutputStream
     */
    @Test
    public void testOutputStream() throws IOException {
        OutputStream out = new FileOutputStream("file/abcd.txt");

        String a = "hello world!!!你好世界嘻嘻";
        byte[] bytes = a.getBytes();

        out.write(bytes);

        out.close();
    }

}
