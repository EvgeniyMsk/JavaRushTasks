package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String filename=reader.readLine();
        FileInputStream fileInputStream = new FileInputStream( filename );

        Map<Integer,Integer> map = new HashMap<Integer, Integer>(  );
        while (fileInputStream.available()>0) {
            Integer key=fileInputStream.read();
            try {
                map.put( key, map.get( key ) + 1);
            }
            catch (NullPointerException e)
            {
                map.put( key, 1);
            }

        }

        int max=Integer.MIN_VALUE;
        for (Map.Entry<Integer,Integer> pair : map.entrySet()) {
            Integer key = pair.getKey();
            Integer value = pair.getValue();
            if (value>max) {max=value;}
        }
        for (Map.Entry<Integer,Integer> pair : map.entrySet()) {
            Integer key = pair.getKey();
            Integer value = pair.getValue();
            if (value==max) {System.out.print( key + " " + value);}
        }
        reader.close();
        fileInputStream.close();
    }
}
