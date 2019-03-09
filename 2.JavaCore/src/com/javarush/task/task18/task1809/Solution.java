package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream( fileName1 );
        FileOutputStream fileOutputStream = new FileOutputStream( fileName2 );
        byte[] buffer = new byte[fileInputStream.available()];
        int j=0;
        while (fileInputStream.available() > 0) {
            fileInputStream.read(buffer);
        }

       /* for (byte k : buffer) {
            System.out.print(k + " ");
        }
        System.out.println(  );*/
        for (int i = buffer.length-1; i>=0; i--) {
            fileOutputStream.write( buffer[i] );
        }
        fileInputStream.close();
        fileOutputStream.close();

    }
}
