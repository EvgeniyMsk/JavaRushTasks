package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader( new InputStreamReader( System.in) );
        //String strMain = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
        String strMain=reader.readLine();
        String arr = strMain.substring(strMain.indexOf( "?" )+1,strMain.length());
        String[] arrSplit=arr.split( "&" );
        ArrayList<String> list=new ArrayList<String>(  );
        String param="";
        for (String s:arrSplit){
            String Qs= s.split( "=" )[0];
            if (Qs.equals( "obj" )) {param=s.split( "=" )[1];}
            list.add( Qs );
        }

        for (int i=0;i<list.size()-1;i++){
            System.out.print( list.get( i ) + " ");
        }
        System.out.print(list.get( list.size()-1 )  );

        System.out.println();
        if (!param.equals( "" )) {
            try {
                alert( Double.parseDouble( param ) );
            } catch (Exception e) {
                alert( param );
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
