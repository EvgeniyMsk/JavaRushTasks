package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String fileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream( fileName );
        Set<Integer> set = new LinkedHashSet<Integer>(  );
        while (fileInputStream.available()>0) {
            set.add( fileInputStream.read() );
        }
        int[] a = new int[set.size()];

        Iterator iterator = set.iterator();
        int i=0;
        while (iterator.hasNext()) {
            a[i] = (int) iterator.next();
            i++;
        }
        Arrays.sort( a );
        for (int j:a) {
            System.out.print( j + " " );
        }
        reader.close();
        fileInputStream.close();
    }
}
