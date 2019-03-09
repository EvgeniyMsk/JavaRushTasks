package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String str=reader.readLine();

        char[] ch=str.toCharArray();
        ArrayList<Character> sogl=new ArrayList<Character>();
        ArrayList<Character> glas=new ArrayList<Character>();
        for (int i=0;i<ch.length;i++){
            if (isVowel(ch[i])) {
                glas.add(ch[i]);
            } else if (ch[i]!=" ".toCharArray()[0]){
                sogl.add(ch[i]);
            }
        }
        for (char c:glas){
            System.out.print(c+ " ");
        }

        System.out.println();
        for (char c:sogl){
            System.out.print(c+ " ");
        }


    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}