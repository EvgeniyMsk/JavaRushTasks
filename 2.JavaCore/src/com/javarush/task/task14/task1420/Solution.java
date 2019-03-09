package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

            int a = Integer.parseInt( reader.readLine() );
            if (a<=0) throw new Exception();
            int b = Integer.parseInt( reader.readLine() );
            if (b<=0) throw new Exception();
            System.out.println( NOD(a,b) );

    }

    public static int NOD(int a, int b) {
        do {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
            while ((a != 0) && (b != 0)) ;

        return a + b;
    }
}
