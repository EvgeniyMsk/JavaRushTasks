package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
        load(new FileInputStream(fileName));
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties prop = new Properties();
        for (Map.Entry<String,String> pair:properties.entrySet()) {
            prop.put(pair.getKey(),pair.getValue());
        }
        prop.store(outputStream, null);
        outputStream.close();
    }

    public void load(InputStream inputStream) throws Exception {
        Properties prop = new Properties();
        prop.load(inputStream);
        for (String i:prop.stringPropertyNames()) {
            properties.put(i, prop.getProperty(i));
        }
        inputStream.close();
    }

    public static void main(String[] args) {

    }
}
