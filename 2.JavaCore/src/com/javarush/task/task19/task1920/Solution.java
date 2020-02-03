package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        //*String fileName = "D:/input.txt";
        String fileName = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        Map<String, Double> map = new TreeMap<>();
        List list = new ArrayList(map.entrySet());
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
        double max = Double.MIN_VALUE;
        String name = null;
        for (Map.Entry<String, Double> pair:map.entrySet()) {
            if (pair.getValue()>max) {
                name = pair.getKey();
                max = pair.getValue();
            } else if (pair.getValue()==max) {
                name = name + " " + pair.getKey();
            }
        }
        System.out.println(name);
    }
}
