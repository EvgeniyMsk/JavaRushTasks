package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    static String command;
    private static String fileNameIn;
    private static String fileNameOut;
    public static void main(String[] args) throws IOException {
        command = args[0];
        fileNameIn = args[1];
        fileNameOut = args[2];
        if (command.equals("-e")) {Encode(fileNameIn,fileNameOut);}
        if (command.equals("-d")) {Decode(fileNameIn,fileNameOut);}
    }

    public static void Encode(String fileNameIn, String FileNameOut) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileNameIn);
        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        for (int i = 0; i < buffer.length - 1; i++) {
            buffer[i] += 3;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(FileNameOut);
        fileOutputStream.write(buffer);
        fileInputStream.close();
        fileOutputStream.close();
    }

    public static void Decode(String fileNameIn, String FileNameOut) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileNameIn);
        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        for (int i=0; i<buffer.length-1; i++) {
            buffer[i]-=3;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(FileNameOut);
        fileOutputStream.write(buffer);
        fileInputStream.close();
        fileOutputStream.close();
    }

}
