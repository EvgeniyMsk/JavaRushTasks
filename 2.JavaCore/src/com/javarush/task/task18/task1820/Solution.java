package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String filename1 = new String( reader.readLine() );
        String filename2 = new String( reader.readLine() );
        FileInputStream fileInputStream = new FileInputStream( filename1 );
        FileOutputStream fileOutputStream = new FileOutputStream( filename2 );
        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        String string = new String( buffer );
        String[] numbers = string.split( " " );
        int[] num = new int[numbers.length];

        for (int i=0;i<numbers.length; i++) {
            num[i] = Math.round( Float.parseFloat( numbers[i] ) );
        }

        for (int i=0;i<numbers.length; i++) {
            numbers[i] = Integer.toString( num[i] );
            fileOutputStream.write( numbers[i].getBytes() );
            fileOutputStream.write( (byte) 32 );
        }
        fileInputStream.close();
        fileOutputStream.close();


    }

}