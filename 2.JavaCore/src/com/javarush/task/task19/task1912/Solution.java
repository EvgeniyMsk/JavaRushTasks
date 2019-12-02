package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream outputStream = System.out;
        ByteArrayOutputStream stream = new ByteArrayOutputStream(  );
        PrintStream printStream = new PrintStream( stream );
        System.setOut( printStream );
        testString.printSomething();
        String result = stream.toString().replaceAll( "te", "??" );
        System.setOut( outputStream );
        System.out.println(result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
