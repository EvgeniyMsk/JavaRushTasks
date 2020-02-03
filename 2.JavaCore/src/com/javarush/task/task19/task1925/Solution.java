package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];


        BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));
        ArrayList<String> list = new ArrayList<>();
        while (reader.ready()) {
            String line = reader.readLine();
            String[] strings = line.split(" ");
            for (String i:strings) {
                if (i.length()>6) {list.add(i);}
            }
        }
        for (int i=0;i<list.size()-1; i++) {
            writer.write(list.get(i)+ ",");
        }
        writer.write(list.get(list.size()-1));
        reader.close();
        writer.close();
    }
}
