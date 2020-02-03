package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream outputStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byteArrayOutputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = byteArrayOutputStream.toString();
        String[] strings = result.split(" ");

        String a1 = strings[0];
        String znak = strings[1];
        String a2 = strings[2];

        if (znak.equals("+")) {
            result = a1 + " " + znak + " " + a2 + " = " + (Integer.parseInt(a1)+Integer.parseInt(a2));
        }
        else if (znak.equals("*")) {
            result = a1 + " " + znak + " " + a2 + " = " + (Integer.parseInt(a1)*Integer.parseInt(a2));
        }
        else if (znak.equals("-"))
        {
            result = a1 + " " + znak + " " + a2 + " = " + (Integer.parseInt(a1)-Integer.parseInt(a2));
        }
        System.setOut(outputStream);
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

