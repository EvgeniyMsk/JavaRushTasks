package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main (String[] args) {

    }
    
    static {
        try {
            reset();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws Exception{
        BufferedReader reader=new BufferedReader( new InputStreamReader( System.in ) );
        String param=reader.readLine();
        if (param.equals( "helicopter" )) {result=new Helicopter();} else
        {String param2=reader.readLine(); result=new Plane(Integer.parseInt( param2 ));}
    }
}
