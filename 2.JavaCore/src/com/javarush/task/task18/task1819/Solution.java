package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        FileOutputStream fileOutputStream1 = new FileOutputStream( filename1 );
        FileInputStream fileInputStream = new FileInputStream( filename1 );
        FileInputStream fileInputStream2 = new FileInputStream( filename2 );

        byte[] buffer2 = new byte[fileInputStream2.available()];
        byte[] buffer1 = new byte[fileInputStream.available()];
        fileInputStream.read(buffer1);
        fileInputStream2.read(buffer2);
        fileOutputStream1.write( buffer2 );
        fileOutputStream1.write( buffer1 );
        fileInputStream.close();
        fileInputStream2.close();
        fileOutputStream1.close();
    }
}
