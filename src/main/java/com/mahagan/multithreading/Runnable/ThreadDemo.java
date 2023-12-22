package com.mahagan.multithreading.Runnable;

public class ThreadDemo
{
    public static void main(String[] args) {
        MyRunnable myRunnable=new MyRunnable();
        Thread thread=new Thread(myRunnable);
        thread.start();
        for (int i=0;i<5;i++)
        {
            System.out.println("main");
        }
    }
}
