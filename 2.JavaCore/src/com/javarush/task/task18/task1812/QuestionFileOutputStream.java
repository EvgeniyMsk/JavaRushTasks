package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream decorator;
    public QuestionFileOutputStream (AmigoOutputStream amigoOutputStream) {
        this.decorator = amigoOutputStream;
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String message = reader.readLine();
        if (message.equals("Д")) {reader.close(); decorator.close();}
    }

    @Override
    public void flush() throws IOException {
    decorator.flush();
    }

    @Override
    public void write(int b) throws IOException {
    decorator.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
    decorator.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
    decorator.write(b, off, len);
    }
}

