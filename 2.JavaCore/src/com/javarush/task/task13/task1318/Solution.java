package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String fileName = null;
        fileName = reader.readLine();
        InputStream inputStream = new FileInputStream( fileName );
        reader.close();

        while (inputStream.available()>0){
            System.out.write(inputStream.read());
        }
        System.out.println(  );
        inputStream.close();
    }
}