package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        FileReader fileReader = new FileReader( reader.readLine() );
        reader.close();
        String line = new String( "" );
        while (fileReader.ready()) {
            char c = (char) fileReader.read();
            line = line + c;
        }
        fileReader.close();

        line = line.toLowerCase();
        line = line.replaceAll("\\p{Punct}", " ");
        line = line.replaceAll("\n", " ");
        String[] mLine = line.split( " " );
        int count =0;
        for (String i:mLine) {
            if (i.equals( "world" )) {
            count++;
            }
        }
        System.out.println(count);

    }
}
