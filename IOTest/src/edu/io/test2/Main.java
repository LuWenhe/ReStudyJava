package edu.io.test2;

import org.junit.Test;

import java.io.*;

public class Main {

    @Test
    public void test4() throws IOException {
        BufferedReader bufferedReader = null;
        Reader reader = new InputStreamReader(System.in);
        bufferedReader = new BufferedReader(reader);
        String str = null;

        while (true) {
            System.out.println("请输入数字:");
            String s = bufferedReader.readLine();

            int i = -1;
            i = Integer.parseInt(s);
            i++;
            System.out.println("输入的数字修改后为：" + i);
            break;
        }
    }

    @Test
    public void test3() throws IOException {
        Writer writer = new OutputStreamWriter(System.out);
        BufferedWriter out = new BufferedWriter(writer);

        //System.in 是 InputStream 类型，使用 InputSreamReader 将 InputStream 类型转换为 Reader 类型
        Reader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);

        String s = in.readLine();
        System.out.println(s);

        in.close();
        out.close();
    }

    @Test
    public void test2() throws IOException {
        PrintWriter out = null;

        File file = new File("file/abcd10.txt");

        out = new PrintWriter(new FileWriter(file));

        out.print("hello world!!!");
        out.close();
    }

    @Test
    public void test() {
        PrintWriter out = null;

//8        out = new PrintWriter(System.out);

        out.print("hello world");

        out.close();

        PrintStream printStream = null;

        System.out.println();

    }

}
