package com.mahagan.multithreading.SleepMethod;

public class Main
{
    public static void main(String[] args) {
        Multi multi=new Multi();
        multi.start();
        for(int i=0;i<6;i++)
        {
            System.out.println(i);
        }
    }
}
