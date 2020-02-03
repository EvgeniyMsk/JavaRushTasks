package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(fileName));

        while (reader1.ready()) {
            System.out.println(reverseString(reader1.readLine()));
        }
        reader1.close();
    }
    public static String reverseString(String string) {
        char[] line = string.toCharArray();
        char[] newLine = new char[line.length];

        for (int i=line.length-1; i>=0; i--) {
            newLine[line.length-i-1] = line[i];
        }
        String str = String.valueOf(newLine);
        return str;
    }
}
