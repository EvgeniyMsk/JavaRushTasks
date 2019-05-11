package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        ArrayList<String> partFile = new ArrayList<String>(  );
        Map<Integer,byte[]> container = new HashMap<>(  );
        String fileName = null;
        while (true)
        {
            String string = reader.readLine();
            if (!string.equals( "end" )) {partFile.add( string );} else break;
        }
        fileName = partFile.get( 0 ).substring( 0, partFile.get( 0 ).indexOf( ".part" ) );
reader.close();
        for (String string:partFile) {
            FileInputStream fileInputStream = new FileInputStream( string );
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            container.put( Integer.parseInt( string.substring( string.indexOf( ".part" ) + 5 ) ), buffer);
            fileInputStream.close();
        }
        FileOutputStream fileOutputStream = new FileOutputStream( fileName );
        for (int i=1; i< container.size()-1; i++){
            fileOutputStream.write( container.get( i ) );
        }
        fileOutputStream.close();



    }
}
