package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader=new BufferedReader( new InputStreamReader( System.in) );
        try{
        firstFileName = reader.readLine();
        secondFileName = reader.readLine();}
        catch (Exception e)
        {}
    }

    public static void main(String[] args) throws InterruptedException {
        //firstFileName="file1.txt";
        //secondFileName="file2.txt";
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fullFileName;
        private String string="";
        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName=fullFileName;
        }

        @Override
        public String getFileContent() {
            return string;
        }

        @Override
        public void run() {
            try {
                BufferedReader reader=new BufferedReader( new FileReader( fullFileName ) );
                String string1=null;
                while ((!((string1=reader.readLine())==null))) {
                    string=string+" "+string1;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (string.length()>0) string=string.substring( 1 );
        }
    }
}
