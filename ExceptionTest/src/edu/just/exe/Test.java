package edu.just.exe;

import java.io.*;

public class Test {

    public static void create() throws IOException {
        InputStream inputStream = new FileInputStream("D:\\ReStudyJava\\ExceptionTest\\abc.txt");
        int b;

        while ((b = inputStream.read()) != -1){
            System.out.print((char) b);
        }

        inputStream.close();
    }

    public static void main(String[] args) throws IOException {
        /*try {
            create();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        create();
    }

}
