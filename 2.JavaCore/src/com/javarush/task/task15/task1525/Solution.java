package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Файл в статическом блоке
*/

public class Solution {
    Statics FILE_NAME;
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            FileReader fileReader = new FileReader( Statics.FILE_NAME );
            BufferedReader bufferedReader = new BufferedReader( fileReader );
            String s = null;
            while ((s=bufferedReader.readLine()) != null) {
                lines.add( s );
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public static void main (String[]args){
            System.out.println( lines );
        }
}
