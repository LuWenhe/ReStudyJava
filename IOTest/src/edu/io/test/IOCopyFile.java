package edu.io.test;

import org.junit.Test;

import java.io.*;

public class IOCopyFile {

    /**
     * > 使用字符输入输出流复制文件
     *
     * 1.先获取输入流，即读取文件
     * 2.再获取输出流，即写文件
     */
    @Test
    public void testCopyFile1() throws IOException {
        File readFile = new File("file/hello.txt");
        //创建字符输入流，即先读取文件中的字符
        Reader in = new FileReader(readFile);

        File writeFile = new File("file/abcd2.txt");
        //创建字符输出流，即将字符内容写入文件
        Writer writer = new FileWriter(writeFile);

        char[] chars = new char[20];
        int len;

        while ((len=in.read(chars)) != -1) {
            writer.write(chars,0,len);
        }

        writer.close();
        in.close();
    }

    /**
     * > 使用字节输入输入输出流复制文件
     *
     * 1.先获取输入流，即先读取文件
     * 2.再获取输出流，即写文件
     *
     */
    @Test
    public void testCopyFile() throws IOException {
        File readFile = new File("D:/Download/Java并发编程的艺术/Java并发编程的艺术.pdf");
        //创建字节输入流
        InputStream in = new FileInputStream(readFile);

        File writeFile = new File("D:/aa.pdf");
        //创建字节输出流
        OutputStream out = new FileOutputStream(writeFile);

        byte[] buffer = new byte[10];
        int len;

        //先从输入流读取文件，并放入到 buffer 数组中
        while ((len=in.read(buffer)) != -1) {
            out.write(buffer,0, len);
        }

        System.out.println("复制成功!!!");

        in.close();
        out.close();
    }

}
