package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream( fileName );
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(  );
        while (fileInputStream.available() > 0) {
            Integer key = fileInputStream.read();
            try {
             map.put( key, map.get( key ) + 1 );
            }
            catch (NullPointerException e) {
                map.put( key, 1 );
            }
        }
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            Integer key = pair.getKey();
            Integer value = pair.getValue();
            if (value<min) {min = value;}
        }
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            Integer key = pair.getKey();
            Integer value = pair.getValue();
            if (value==min) {System.out.print( key + " ");}
        }
        reader.close();
        fileInputStream.close();

    }
}
