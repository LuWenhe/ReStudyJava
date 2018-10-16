package edu.io.test;

import org.junit.Test;

import java.io.*;

public class IOBuffer {

    @Test
    public void testBuffered3() throws IOException {
        File file = new File("file/abcd7.txt");
        Writer writer = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(writer);

        bw.write("1234\n");
        bw.write("2345\n");
        bw.write("3456\n");
        bw.write("\n");
        bw.write("4567\n");

        //注意两个 close 的位置不能交换
        bw.close();
        writer.close();

        if (file.exists() && file.getName().endsWith(".txt")) {
            Reader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String str = null;

            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }

            reader.close();
            br.close();
        }
    }

    @Test
    public void testBufferedInputAndOutput() throws IOException {
        File readFile = new File("file/hello.txt");
        //输入流，读取文件的字节内容
        InputStream in = new FileInputStream(readFile);
        BufferedInputStream bf = new BufferedInputStream(in);

        File writeFile = new File("file/abcd4.txt");
        //输出流，将字节内容写入文件
        OutputStream out = new FileOutputStream(writeFile);
        BufferedOutputStream of = new BufferedOutputStream(out);

        byte[] buffer = new byte[20];
        int len;
        while ((len = bf.read(buffer)) != -1) {
            of.write(buffer,0, len);
        }

        of.close();
        bf.close();
    }

    /**
     * 使用 BufferedReader 和 BufferedWriter 包装类
     * @throws IOException
     */
    @Test
    public void testBufferedReaderAndWriter() throws IOException {
        File readFile = new File("file/hello.txt");
        //输入流，读取文件字符内容
        Reader in = new FileReader(readFile);
        BufferedReader bufferedReader = new BufferedReader(in);

        File writeFile = new File("file/abcd3.txt");
        //输出流，将字符内容写入文件
        Writer out  = new FileWriter(writeFile);
        BufferedWriter bufferedWriter = new BufferedWriter(out);

        String str;
        int i = 0;
        while ((str = bufferedReader.readLine()) != null) {
            if (i != 0) {
                bufferedWriter.write("\n");
            }
            bufferedWriter.write(str);
            i++;
        }

        bufferedWriter.close();
        bufferedReader.close();
    }

    @Test
    public void testBufferedReader() throws IOException {
        File file = new File("file/hello.txt");

        Reader in = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(in);

        String s;
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
        }
    }

}
