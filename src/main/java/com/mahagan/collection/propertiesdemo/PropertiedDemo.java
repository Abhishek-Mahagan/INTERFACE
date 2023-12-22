package com.mahagan.collection.propertiesdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiedDemo
{
    public static void main(String[] args) throws IOException {
        Properties properties =new Properties();
        FileInputStream fis=new FileInputStream("abc.properties");
        properties.load(fis);
        System.out.println(properties);
        properties.setProperty("user","8888");
        FileOutputStream fos=new FileOutputStream("com.mahagan.propertiesdemo.abc.properties");
        properties.store(fos,"Upadated by abhishek");

    }
}
