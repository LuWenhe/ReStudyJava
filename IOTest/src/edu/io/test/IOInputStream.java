package edu.io.test;

import org.junit.Test;

import java.io.*;

public class IOInputStream {

    @Test
    public void testBufferedReaderAndWriter() throws Exception {
        InputStream in = new FileInputStream("file/hello.txt");
        Reader reader = new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        OutputStream out = new FileOutputStream("file/abcd6.txt");
        Writer writer = new OutputStreamWriter(out);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String str;
        int j = 0;
        while ((str = bufferedReader.readLine()) != null) {
            if (j != 0) {
                bufferedWriter.write("\n");
            }
            j++;
            bufferedWriter.write(str);
        }

        bufferedWriter.close();
        bufferedReader.close();
    }

    @Test
    public void testBufferedWriter() throws IOException {
        //输出流，可以将字符输入文件
        OutputStream out = new FileOutputStream("file/abcd5.txt");

        //将输出字符类转为输出字节流
        Writer writer = new OutputStreamWriter(out);

        //将输出字节流转为带缓冲的输出字节流
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String a = "我们是一家人";
        bufferedWriter.write(a);

        bufferedWriter.close();
        out.close();
        writer.close();
    }

    @Test
    public void tesBufferedReader() throws IOException {
        //输入流，可以从文件读取字符
        InputStream in = new FileInputStream("file/hello.txt");

        //把输入字节流转为输入字符流
        Reader reader = new InputStreamReader(in);

        //将输入字符类转为带缓冲的输入字符类
        BufferedReader bf = new BufferedReader(reader);

        String str;
        while ((str = bf.readLine()) != null) {
            System.out.println(str);
        }

        bf.close();
    }

    @Test
    public void testBufferedOutput() throws IOException {
        OutputStream out = new FileOutputStream("file/hello2.txt");

        BufferedOutputStream bo = new BufferedOutputStream(out);

        bo.write("nihaoshijie".getBytes());

        out.close();
    }

    @Test
    public void testBufferedInput() throws IOException {
        InputStream in = new FileInputStream("file/hello.txt");

        BufferedInputStream bf = new BufferedInputStream(in);

        byte[] buffer = new byte[10];
        int len;

        while ((len = bf.read(buffer)) != -1) {
            for (int i = 0; i < len; i++) {
                System.out.print((char)buffer[i]);
            }
        }

        bf.close();
    }
}
