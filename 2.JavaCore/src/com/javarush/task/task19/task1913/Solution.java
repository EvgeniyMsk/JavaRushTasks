package com.javarush.task.task19.task1913;

/* 
Выводим только цифры
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream outputStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(  );
        PrintStream printStream = new PrintStream( byteArrayOutputStream );
        System.setOut( printStream );
        testString.printSomething();
        String result =  byteArrayOutputStream.toString();
        StringBuilder stringBuilder = new StringBuilder(  );
        for (int i = 0;i<result.length();i++) {

            if ((result.charAt( i )==('1'))||(result.charAt( i )==('2'))||(result.charAt( i )==('3'))
                    ||(result.charAt( i )==('4'))||(result.charAt( i )==('5'))||(result.charAt( i )==('6'))
                    ||(result.charAt( i )==('7'))||(result.charAt( i )==('8'))||(result.charAt( i )==('9'))
                    ||(result.charAt( i )==('0'))) {
                stringBuilder.append( result.charAt( i ) );
            }
        }
        System.setOut( outputStream );
        System.out.println(stringBuilder);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
