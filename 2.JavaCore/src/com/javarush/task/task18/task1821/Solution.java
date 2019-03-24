package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String filename1 = args[0];
        //String filename1 = new String( "C:/input.txt" );
        FileInputStream fileInputStream = new FileInputStream( filename1 );
        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        String string = new String(buffer);
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>(  );
        for (char i:string.toCharArray()) {
            try {
                map.put( (int) i, map.get( (int) i) + 1);
            }
            catch (NullPointerException e) {
                map.put( (int) i, 1);
            }
        }
        for (Map.Entry<Integer,Integer> pair:map.entrySet()) {
            int key = pair.getKey();
            int value = pair.getValue();
            System.out.println((char)key + " " + value);
        }
        fileInputStream.close();


    }

}
