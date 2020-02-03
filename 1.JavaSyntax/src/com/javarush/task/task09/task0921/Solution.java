package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {


        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        try {
            while (true){
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                arrayList.add(Integer.parseInt(reader.readLine()));}

        } catch (Exception e) {
            for (int x:arrayList){
                System.out.println(x);
            }
        }
    }



}