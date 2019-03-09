package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream( fileName1 );
        FileOutputStream fileOutputStream1 = new FileOutputStream( fileName2 );
        FileOutputStream fileOutputStream2 = new FileOutputStream( fileName3 );
        int countAll = fileInputStream.available();
        //System.out.println( countAll );
        int c1=countAll/2;
        int c2=countAll-countAll/2;
        while (fileInputStream.available()>0) {
            byte[] buffer1 = new byte[c2];
            byte[] buffer2 = new byte[c1];
            fileInputStream.read(buffer1);
            fileInputStream.read(buffer2);
            fileOutputStream1.write( buffer1 );
            fileOutputStream2.write( buffer2 );
        }
        fileInputStream.close();
        fileOutputStream1.close();
        fileOutputStream2.close();



    }
}
