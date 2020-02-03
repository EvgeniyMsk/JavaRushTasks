package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        //String fileName = "D:/input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        while (reader.ready()) {
        String line = reader.readLine();
        String[] data = line.split(" ");
        int count = data.length-1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<count-2;i++) {
            stringBuilder.append(data[i]+ " ");
        }
        stringBuilder.delete(stringBuilder.length()-1,stringBuilder.length());
        String name = stringBuilder.toString();


        Date date = new Date(Date.parse(data[count]+"/"+data[count-1]+"/"+data[count-2]));
        PEOPLE.add(new Person(name, date));
        }
        reader.close();
       /* SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd mm yyyy",Locale.ENGLISH);
        System.out.println(PEOPLE.get(0).getName() + " " + PEOPLE.get(0).getBirthDate());*/
    }
}
