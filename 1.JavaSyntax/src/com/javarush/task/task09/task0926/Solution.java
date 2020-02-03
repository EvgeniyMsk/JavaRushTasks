package com.javarush.task.task09.task0926;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> arrayList=new ArrayList<int[]>();
        int[] m5=new int[5];
        int[] m2=new int[2];
        int[] m4=new int[4];
        int[] m7=new int[7];
        int[] m0=new int[0];
        arrayList.add(m5);
        arrayList.add(m2);
        arrayList.add(m4);
        arrayList.add(m7);
        arrayList.add(m0);
        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
