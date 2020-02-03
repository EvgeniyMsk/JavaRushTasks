package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        //String fileName = "D:/input.txt";
        Map<String, Double> map = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()) {
            String line = reader.readLine();
            String[] data = line.split(" ");
            try {
            map.put(data[0], map.get(data[0]) + Double.parseDouble(data[1]));
            }
            catch (Exception e) {
                map.put(data[0], Double.parseDouble(data[1]));
            }
        }
        reader.close();


        for (Map.Entry<String, Double> pair:map.entrySet()) {
            String secondName = pair.getKey();
            Double count = pair.getValue();
            System.out.println(secondName + " " + count);
        }

    }
}
