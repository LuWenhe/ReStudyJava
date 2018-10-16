package edu.io.test;

import org.junit.Test;

import java.io.*;

public class IOInputAndReader {

    @Test
    public void testRead3() throws IOException {
        File file = new File("file/hello.txt");
        Reader reader = new FileReader(file);

        char[] buffer = new char[1024];
        //读取 buffer 数组中从 buffer[10] 开始的 50 个字符，返回实际成功读取的字符数
        reader.read(buffer,10,50);

        reader.close();
    }

    @Test
    public void testReader2() throws IOException {
        File file = new File("file/hello.txt");
        Reader reader = new FileReader(file);

        char[] buffer = new char[30];
        int len;

        //读取 buffer.length 个字符的数据并且放到 buffer 数组中
        while ((len=reader.read(buffer)) != -1) {
            //从 buffer 数组中遍历获取字符
            for (int i = 0; i < len; i++) {
                System.out.print(buffer[i]);
            }
        }

        reader.close();
    }

    /**
     * Reader：输入字节流
     * FileReader：创建了一个可以从文件读取字符内容的 Reader 类
     */
    @Test
    public void testReader() throws IOException {
        File file = new File("file/hello.txt");
        Reader reader = new FileReader(file);

        //每次读取下一个字符，返回当前读取的字符的 ascii
        int result = reader.read();

        while (result != -1) {
            System.out.print((char) result);
            result = reader.read();
        }

        reader.close();
    }

    /**
     * available()：返回当前可读的输入字节数
     */
    @Test
    public void testInputStram3() throws IOException {
        File file = new File("file/hello.txt");
        FileInputStream in = new FileInputStream(file);

        byte[] buffer = new byte[1024*10];      //10k
        in.read(buffer,10,in.available());
        in.close();
    }

    @Test
    public void testInputStream2() throws IOException {
        File file = new File("file/hello.txt");
        FileInputStream in = new FileInputStream(file);
        byte[] buffer = new byte[30];
        int len;

        //读取 buffer.length 个字节的数据并放到 buffer 数组中，返回实际读取的字节数
        while ((len = in.read(buffer)) != -1) {
            for (int i = 0; i < len; i++) {
                System.out.print((char)buffer[i]);
            }
        }

        in.close();
    }

    /**
     * InputStream：输入字节流
     * FileInputStream：文件输入流，能创建一个从文件读取字节的 InputStream 类
     */
    @Test
    public void testInputStream() throws IOException {
        File file = new File("file/hello.txt");
        InputStream in = new FileInputStream(file);

        int read = in.read();

        //一次读取一个字节，-1表示读取到文件的结尾处
        while (read != -1) {
            System.out.print((char)read);
            read = in.read();
        }

        in.close();
    }

    @Test
    public void testFile1() {
        //D:\Download
        String fileName = "D:" + File.separator + "Download";
        File file = new File(fileName);

        if (file.exists() && file.isDirectory()) {
            System.out.println("file是一个文件夹");

            //获取目录下的所有文件或者文件夹
            File[] files = file.listFiles();
            for (File file1: files) {
                System.out.println(file1);
            }

            System.out.println();
            System.out.println("files[1]的文件名为：" + files[0].getName());
            System.out.println("files[1]的文件路径：" + files[1].getPath());
            System.out.println("files[1]的文件的绝对路径：" + files[1].getAbsolutePath());
            System.out.println("files[1]文件的父目录路径：" + files[1].getParent());
            System.out.println("files[1]是否存在：" + files[1].exists());
            System.out.println("files[1]是否可读：" + files[1].canRead());
            System.out.println("files[1]是否可写：" + files[1].canWrite());
            System.out.println("files[1]是否可执行：" + files[1].canExecute());
            System.out.println("files[1]是否是目录：" + files[1].isDirectory());
            System.out.println("files[1]是否是文件：" + files[1].isFile());
            System.out.println("files[1]是否是绝对路径：" + files[1].isAbsolute());
            System.out.println("files[1]的最后修改时间：" + files[1].lastModified());
            System.out.println("files[1]的字节数：" + files[1].length());
            System.out.println("files[1]的文件路径后的路径名：" + files[1].toURI());

        } else {
            System.out.println("不存在");
        }
    }

    public static void deleteDir(File file) {
        if (file.isDirectory()) {
            //获取当前文件夹下的文件夹和目录
            File[] subFiles = file.listFiles();

            for (File file1: subFiles) {
                deleteDir(file1);
            }
        }

        file.delete();
    }

    @Test
    public void testFile2() {
        File file = new File("D:" + File.separator + "新建文件夹");
        deleteDir(file);
     }

}
