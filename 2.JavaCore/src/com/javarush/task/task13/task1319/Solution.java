package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader( new InputStreamReader( System.in ));
        String FileName=null;
        FileName=reader.readLine();
        File file=new File( FileName );
        BufferedWriter writer=new BufferedWriter( new FileWriter( file ));

        while (true){
            String string=reader.readLine();
            writer.write( string + System.getProperty("line.separator"));
            if (string.equals( "exit" )) {
                break;
            }
        }
        writer.close();
    }
}
