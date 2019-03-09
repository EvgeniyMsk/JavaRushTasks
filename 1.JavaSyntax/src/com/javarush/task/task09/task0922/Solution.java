package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);
        Date date=new Date();
        date=simpleDateFormat.parse(reader.readLine());
        System.out.println(simpleDateFormat1.format(date).toUpperCase());
    }
}
