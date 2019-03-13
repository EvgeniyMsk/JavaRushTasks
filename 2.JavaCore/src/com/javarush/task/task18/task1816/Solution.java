package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String param = args[0];
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        alphabet = alphabet + alphabet.toUpperCase();
        char[] ch = alphabet.toCharArray();

        //String FileName = "C:/input.txt";

        FileInputStream fileInputStream = new FileInputStream( param );
        byte[] count = new byte[fileInputStream.available()];
        while (fileInputStream.available()>0) {
            fileInputStream.read(count);
        }
        int q =0;
        for (byte i:count) {
            for (char c:ch) {
                if ((byte)c==i) q++;
            }
        }
        System.out.println( q );
        fileInputStream.close();

    }
}
