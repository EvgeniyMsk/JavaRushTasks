package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream output = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream myStream = new PrintStream(byteArrayOutputStream);
        System.setOut(myStream);
        testString.printSomething();
        String string = byteArrayOutputStream.toString();
        String[] lines = string.split("\n");
        System.setOut(output);
        for (int i = 0; i<lines.length; i++) {
            System.out.println(lines[i]);
            if ((i>0)&&(i%2!=0)) {
                System.out.println("JavaRush - курсы Java онлайн");
            }
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
