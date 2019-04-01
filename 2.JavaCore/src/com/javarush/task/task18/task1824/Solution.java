package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        while (true) {
            String string = reader.readLine();
            try {
                FileInputStream fileInputStream = new FileInputStream( string );
                fileInputStream.close();
            }
            catch (FileNotFoundException e) {
                reader.close();
                System.out.println(string);
                break;
            }
        }
    }
}
