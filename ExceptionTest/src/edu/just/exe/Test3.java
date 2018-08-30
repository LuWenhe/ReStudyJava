package edu.just.exe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test3 {

    public String openFile() {
        try {
            FileInputStream inputStream = new FileInputStream("D:\\ReStudyJava\\ExceptionTest\\ab.txt");
            int ch = inputStream.read();
            System.out.println(ch);
            return "try";
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return "catch1";
        } catch (IOException e) {
            System.out.println("io exception");
            return "catch2";
        }  finally {
            System.out.println("finally block");
            return "catch3";
        }
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        String s = test3.openFile();
        System.out.println(s);
    }
}
