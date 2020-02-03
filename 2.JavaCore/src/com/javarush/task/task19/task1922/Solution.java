package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        //String fileName = "D:/input.txt";
        BufferedReader reader1 = new BufferedReader(new FileReader(fileName));
        while (reader1.ready()) {
            String line = reader1.readLine();
            String[] data = line.split(" ");
            int count = 0;
            for (String i:data) {
                for (int j=0;j<words.size();j++) {
                    if (words.get(j).equals(i)) {
                        count++;
                    }
                }
            }
            if (count==2) {
                System.out.println(line);
            }
        }
        reader1.close();

    }
}
