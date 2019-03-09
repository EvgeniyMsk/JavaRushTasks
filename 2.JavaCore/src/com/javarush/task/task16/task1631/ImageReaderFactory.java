package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

import java.io.Reader;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes image) {
        ImageReader reader;
        if (image!=null) {
            switch (image) {
                case BMP: {
                    reader = new BmpReader();
                    return reader;
                }
                case JPG: {
                    reader = new JpgReader();
                    return reader;
                }
                case PNG: {
                    reader = new PngReader();
                    return reader;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        else throw new IllegalArgumentException();
    }


}
