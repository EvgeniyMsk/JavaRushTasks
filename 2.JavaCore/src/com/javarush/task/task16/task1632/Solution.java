package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add( new Thread1() );
        threads.add( new Thread2() );
        threads.add( new Thread3() );
        threads.add( new Thread4() );
        threads.add( new Thread5() );
    }
    public static void main(String[] args) {

    }
    public static class Thread1 extends Thread {
        @Override
        public void run() {
            int i=0;
            while (true) {

            }
        }
    }
    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                while (!isInterrupted()) {

                }
                throw new InterruptedException(  );
            }
            catch (InterruptedException e)
            {
                System.out.println( "InterruptedException" );
            }
        }
    }
    public static class Thread3 extends Thread {
        @Override
        public void run() {
            while (true){
                System.out.println( "Ура" );
                try {
                    sleep( 500 );
                } catch (InterruptedException e) {

                }
            }
        }


    }
    public static class Thread4 extends Thread implements Message{
        @Override
        public void showWarning() {
            this.interrupt();
            try
            {
                this.join();
            }
            catch(Exception e)
            {

            }
        }

        @Override
        public void run() {
            Thread thread=Thread.currentThread();
            while (!currentThread().isInterrupted()) {

            }
        }
    }
    public static class Thread5 extends Thread {
        @Override
        public void run() {
            BufferedReader reader=new BufferedReader( new InputStreamReader( System.in ) );
            String string=null;
            int n=0;
            try {
                while (!isInterrupted()) {
                    string=reader.readLine();
                    if (!string.equals( "N" )) {n=n+Integer.parseInt( string );} else {this.interrupt();}
                }
                throw new InterruptedException(  );
            }
            catch (IOException e) {

            }
            catch (InterruptedException e) {
            System.out.println( n );
            }
        }
    }

}