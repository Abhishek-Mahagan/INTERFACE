package com.mahagan.multithreading.SychWithTwoThread;

public class SychDemo
{
    public static void main(String[] args) {
        Display d=new Display();
        Mythread1 t1=new Mythread1(d);
        Mythread2 t2=new Mythread2(d);
        t1.start();
        t2.start();

    }
}
