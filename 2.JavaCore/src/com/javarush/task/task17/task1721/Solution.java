package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String file1=reader.readLine();
        String file2=reader.readLine();
        reader.close();
        String line=null;
        BufferedReader reader1=new BufferedReader(new FileReader(file1));
        BufferedReader reader2=new BufferedReader(new FileReader(file2));

        while (!((line=reader1.readLine())==null)) {
            allLines.add(line);
        }
        reader1.close();
        while (!((line=reader2.readLine())==null)) {
            forRemoveLines.add(line);
        }
        reader2.close();
        new Solution().joinData();

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else
        {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
