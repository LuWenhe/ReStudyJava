package edu.just.try1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryTest {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("D:\\ReStudyJava\\ExceptionTest\\abc.txt");
        int b;

        while ((b = inputStream.read()) != -1){
            System.out.print((char) b);
        }

        inputStream.close();
    }

}
