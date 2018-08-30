package edu.just.exe;

import java.io.IOException;

public class FileFormatException extends IOException {

    FileFormatException(){}

    public FileFormatException(String str){
        super(str);
    }

}
