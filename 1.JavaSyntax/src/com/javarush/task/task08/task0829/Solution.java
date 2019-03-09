package com.javarush.task.task08.task0829;

import javafx.beans.binding.MapBinding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        Map<String, String> addresses = new HashMap<String, String>();

        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {break;}
            else {
                String family = reader.readLine();
                addresses.put(city,family);
            }

        }
        String citykey=reader.readLine();
        System.out.println(addresses.get(citykey));
    }
}
