package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;
        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            String[] myLine = line.split( " " );
            String firstName = myLine[1];
            String middleName = myLine[2];
            String lastName = myLine[0];

            Calendar calendar = new GregorianCalendar(Integer.parseInt(myLine[5]),
                    Integer.parseInt(myLine[4])-1,
                    Integer.parseInt(myLine[3]));
            return new Person( firstName, middleName, lastName ,calendar.getTime() );
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
