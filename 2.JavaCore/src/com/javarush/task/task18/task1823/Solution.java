package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        while (true) {
        String string = reader.readLine();
        if (!string.equals( "exit" )) {
            new ReadThread( string ).start();
        }
        else {
            reader.close();
            break;
        }
    }
    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName) throws IOException {
            FileInputStream fileInputStream = new FileInputStream( fileName );
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            fileInputStream.close();
            int max = Integer.MIN_VALUE;
            Map<Byte,Integer> myMap = new HashMap<>(  );
            for (byte i:buffer) {
                try {
                    myMap.put( i, myMap.get( i ) + 1);
                }
                catch (NullPointerException e) {
                    myMap.put( i, 1 );
                }
            }

            for (Map.Entry<Byte, Integer> pair : myMap.entrySet()) {
                if (pair.getValue()>max) {
                    max = pair.getValue();
                }
            }
            Map.Entry<Byte, Integer> pair1 = null;

            for (Map.Entry<Byte, Integer> pair : myMap.entrySet()) {
                if (pair.getValue()==max) {
                    pair1 = pair;
                }
            }
            resultMap.put( fileName, (int) pair1.getKey() );
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
