package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String FileName = null;
        FileName = reader.readLine();
        Scanner scanner = new Scanner( new FileInputStream( FileName ) );
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (scanner.hasNext()){
            int temp=scanner.nextInt();
            if (temp%2==0) {list.add( temp );}
        }
        scanner.close();
        Collections.sort( list );
        for (int i:list){
            System.out.println( i );
        }
    }
}
