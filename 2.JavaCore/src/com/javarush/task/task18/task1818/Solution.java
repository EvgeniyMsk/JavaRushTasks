package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        String filename3 = reader.readLine();
        FileOutputStream fileInputStream1 = new FileOutputStream( filename1 );
        FileInputStream fileOutputStream2 = new FileInputStream( filename2 );
        FileInputStream fileOutputStream3 = new FileInputStream( filename3 );
        byte[] buffer2 = new byte[fileOutputStream2.available()];
        byte[] buffer3 = new byte[fileOutputStream3.available()];

        fileOutputStream2.read(buffer2);
        fileOutputStream3.read(buffer3);

        fileInputStream1.write( buffer2 );
        fileInputStream1.write( buffer3 );
        fileInputStream1.close();
        fileOutputStream2.close();
        fileOutputStream3.close();
    }
}
