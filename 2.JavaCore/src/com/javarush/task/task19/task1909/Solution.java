package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader( new InputStreamReader( System.in ) );
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader( new FileReader( fileName1 ) );
        BufferedWriter fileWriter = new BufferedWriter( new FileWriter( fileName2 ) );

        while (fileReader.ready()) {
            int c = fileReader.read();
            if (c==46) fileWriter.write( 33 ); else  fileWriter.write( c );
        }
        fileReader.close();
        fileWriter.close();

    }
}
