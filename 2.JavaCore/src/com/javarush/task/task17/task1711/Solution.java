package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD 2
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
*/


public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        switch (args[0]) {
            case "-c": synchronized (allPeople){
                c( args );
                break;
            }
            case "-u": synchronized (allPeople){
                u( args );
                break;
            }
            case "-d": synchronized (allPeople){
                d( args );
                break;
            }
            case "-i": synchronized (allPeople){
                i( args );
                break;
            }
    }
    }

    public static void c(String[] parameters) throws ParseException {
            String[] InputParam = parameters;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "dd/MM/yyyy", Locale.ENGLISH );

            for (int i = 1; i < parameters.length-1; i+=3) {
                String name = parameters[i];
                String sex = parameters[i+1];
                Date bd = simpleDateFormat.parse( parameters[i + 2] );
                switch (sex) {
                    case "м": {
                        allPeople.add( Person.createMale( name, bd ) );
                        break;
                    }
                    case "ж": {
                        allPeople.add( Person.createFemale( name, bd ) );
                        break;
                    }
                }
            System.out.println( allPeople.size()-1 );
            }

    }

    public static void u(String[] parameters) throws ParseException {
            String[] InputParam = parameters;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "dd/MM/yyyy", Locale.ENGLISH );

            for (int i = 1; i < parameters.length - 1; i+=4) {
                int id = Integer.parseInt( parameters[i] );
                String name = parameters[i + 1];
                String sex = parameters[i +2];
                Date bd = simpleDateFormat.parse( parameters[i + 3] );
                switch (sex) {
                    case "м": {
                        allPeople.get( id ).setName( name );
                        allPeople.get( id ).setSex( Sex.MALE );
                        allPeople.get( id ).setBirthDate( bd );
                        break;
                    }
                    case "ж": {
                        allPeople.get( id ).setName( name );
                        allPeople.get( id ).setSex( Sex.FEMALE );
                        allPeople.get( id ).setBirthDate( bd );
                        break;
                    }
                }
            }
    }

    public static void d(String[] parameters) throws ParseException {

            String[] InputParam = parameters;
            for (int i = 1; i <= parameters.length - 1; i++) {
                int id = Integer.parseInt( parameters[i] );
                allPeople.get( id ).setName( null );
                allPeople.get( id ).setSex( null );
                allPeople.get( id ).setBirthDate( null );
            }
    }

    public static void i(String[] parameters) throws ParseException {
            String[] InputParam = parameters;
            for (int i = 1; i <= parameters.length - 1; i++) {
                int id = Integer.parseInt( parameters[i] );
                String sex = null;
                SimpleDateFormat sdf = new SimpleDateFormat( "dd-MMM-yyyy", Locale.ENGLISH );
                if (allPeople.get( id ).getSex().equals( Sex.MALE )) {
                    sex = "м";
                } else {
                    sex = "ж";
                }
                System.out.println( allPeople.get( id ).getName() + " " + sex + " " + sdf.format( allPeople.get( id ).getBirthDate() ) );
            }
    }




}
