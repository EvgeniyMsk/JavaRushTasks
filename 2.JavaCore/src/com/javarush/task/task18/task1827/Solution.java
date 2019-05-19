package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length>0) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

            String command = args[0];
            String productName = args[1];
            String price = args[2];
            String quantity = args[3];
            int id = 0;
            FileInputStream fileInputStream = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
            String line;
            ArrayList<String> myList = new ArrayList<String>();
            while ((line = br.readLine()) != null) {
                myList.add(line);
            }
            br.close();
            for (String i : myList) {
                int thisId = Integer.parseInt(i.substring(0, 8).replaceAll(" ", ""));
                if (thisId > id) id = thisId;
            }
            id++;
            myList.add(modifyId(Integer.toString(id), 8) + modifyId(productName, 30) + modifyId(price, 8) + modifyId(quantity, 4));


            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
            for (String i : myList) {
                writer.write(i + "\n");
            }
            writer.close();
        }

    }

    public static String modifyId(String str,int num) {
    if (str.length()>=num) return str.substring(0,num); else
    {
       int rez = num - str.length();
       String sb = str;
       for (int i = 0;i<rez;i++) {
           sb = sb + " ";
       }
       return sb;
    }
    }

}
