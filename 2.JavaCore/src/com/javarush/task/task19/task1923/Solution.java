package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];
        BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));
        while (reader.ready()) {
            String line = reader.readLine();
            String[] strings = line.split(" ");
            for (String i:strings) {
                if ((i.contains("0"))||(i.contains("1"))||(i.contains("2"))||(i.contains("3"))||(i.contains("4"))
                ||(i.contains("5"))||(i.contains("6"))||(i.contains("7"))||(i.contains("8"))||(i.contains("9"))) {
                writer.write(i + " ");
                }
            }
        }
        reader.close();
        writer.close();
    }
}
