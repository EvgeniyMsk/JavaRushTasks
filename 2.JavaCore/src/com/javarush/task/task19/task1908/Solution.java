package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        //String fileName1 = "C:/input.txt";
        //String fileName2 = "C:/output.txt";
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));
        StringBuilder stringBuilder = new StringBuilder(  );
        while (fileReader.ready()) {
            stringBuilder.append( (char)fileReader.read() );
        }
        String string = new String( stringBuilder);
        String[] strings = string.split( " " );
        for (String i:strings) {
            try {
                Integer.parseInt( i );
                fileWriter.write( i );
                fileWriter.write( 32 );
            }
            catch (NumberFormatException e) {

            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
